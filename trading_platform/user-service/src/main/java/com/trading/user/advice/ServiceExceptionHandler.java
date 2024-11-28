package com.trading.user.advice;

import com.trading.user.exceptions.InsufficientBalanceException;
import com.trading.user.exceptions.InsufficientSharesException;
import com.trading.user.exceptions.UnknownTickerException;
import com.trading.user.exceptions.UnknownUserException;
import io.grpc.Status;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class ServiceExceptionHandler {

    @GrpcExceptionHandler(UnknownTickerException.class)
    public Status handleInvalidArguments(UnknownTickerException e) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage());
    }

    @GrpcExceptionHandler(UnknownUserException.class)
    public Status handleUnknownEntities(UnknownUserException e) {
        return Status.NOT_FOUND.withDescription(e.getMessage());
    }

    @GrpcExceptionHandler({InsufficientBalanceException.class, InsufficientSharesException.class})
    public Status handlePreconditionFailures(Exception e) {
        return Status.FAILED_PRECONDITION.withDescription(e.getMessage());
    }
}
