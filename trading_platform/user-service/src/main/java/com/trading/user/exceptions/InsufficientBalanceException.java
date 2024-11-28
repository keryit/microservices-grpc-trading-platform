package com.trading.user.exceptions;

public class InsufficientBalanceException extends RuntimeException {

    private static final String MESSAGE = "User [id=%d] does not have enough money";

    public InsufficientBalanceException(Integer userId) {
        super(MESSAGE.formatted(userId));
    }
}
