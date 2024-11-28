package com.trading.user.exceptions;

public class InsufficientSharesException extends RuntimeException {

    public static final String MESSAGE = "User [id=%d] has not enough shares";

    public InsufficientSharesException(Integer userId) {
        super(MESSAGE.formatted(userId));
    }
}
