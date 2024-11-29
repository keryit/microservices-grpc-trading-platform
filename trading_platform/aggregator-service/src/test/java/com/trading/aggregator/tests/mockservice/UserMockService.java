package com.trading.aggregator.tests.mockservice;

import com.trading.user.StockTradeRequest;
import com.trading.user.StockTradeResponse;
import com.trading.user.UserInformation;
import com.trading.user.UserInformationRequest;
import com.trading.user.UserServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserMockService extends UserServiceGrpc.UserServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(UserMockService.class);

    @Override
    public void getUserInformation(UserInformationRequest request, StreamObserver<UserInformation> responseObserver) {
        if (request.getUserId() == 1) {
            var user = UserInformation.newBuilder()
                    .setUserId(1)
                    .setBalance(100)
                    .setName("integration-test")
                    .build();
            log.info("user created {}", user.getName());
            responseObserver.onNext(user);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

    @Override
    public void tradeStock(StockTradeRequest request, StreamObserver<StockTradeResponse> responseObserver) {
        var response = StockTradeResponse.newBuilder()
                .setUserId(request.getUserId())
                .setTicker(request.getTicker())
                .setAction(request.getAction())
                .setPrice(request.getPrice())
                .setQuantity(request.getQuantity())
                .setTotalPrice(1000)
                .setBalance(0)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}