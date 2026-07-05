package com.guru.javaConcepts.designPatterns.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        paymentStrategy.pay(amount);
    }
}
