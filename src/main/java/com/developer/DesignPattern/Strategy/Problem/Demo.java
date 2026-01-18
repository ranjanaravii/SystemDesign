package com.developer.DesignPattern.Strategy.Problem;

public class Demo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("upi", 30.50);
        paymentProcessor.processPayment("cash", 100);
    }
}
