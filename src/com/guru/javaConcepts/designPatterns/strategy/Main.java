package com.guru.javaConcepts.designPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new UpiPayment());
        shoppingCart.checkOut(1000);
    }
}
