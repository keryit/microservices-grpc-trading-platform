package com.trading.aggregator.service;

import com.trading.aggregator.dto.PriceUpdateDto;
import com.trading.stock.PriceUpdate;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class PriceUpdateListener implements StreamObserver<PriceUpdate> {

    private static final Logger log = LoggerFactory.getLogger(PriceUpdateListener.class);
    private final Set<SseEmitter> sseEmitters = Collections.synchronizedSet(new HashSet<>());
    private final long sseTimeout;

    public PriceUpdateListener(@Value("${sse.timeout:300000}") long sseTimeout) {
        this.sseTimeout = sseTimeout;
    }

    public SseEmitter createEmitter() {
        var emitter = new SseEmitter(this.sseTimeout);
        this.sseEmitters.add(emitter);
        emitter.onTimeout(() -> this.sseEmitters.remove(emitter));
        emitter.onError(ex -> this.sseEmitters.remove(emitter));
        return emitter;
    }

    @Override
    public void onNext(PriceUpdate priceUpdate) {
        var dto = new PriceUpdateDto(priceUpdate.getTicker().toString(), priceUpdate.getPrice());
        this.sseEmitters.removeIf(e -> !this.send(e, dto));

    }

    @Override
    public void onError(Throwable throwable) {
        log.error("streaming error", throwable);
        this.sseEmitters.forEach(e -> e.completeWithError(throwable));
        this.sseEmitters.clear();
    }

    @Override
    public void onCompleted() {
        this.sseEmitters.forEach(ResponseBodyEmitter::complete);
        this.sseEmitters.clear();
    }

    private boolean send(SseEmitter emitter, Object o) {
        try {
            emitter.send(o);
            return true;
        } catch (IOException e) {
            log.warn("sse error {}", e.getMessage());
            return false;
        }
    }
}
