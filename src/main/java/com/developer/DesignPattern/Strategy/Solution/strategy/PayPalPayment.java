package com.developer.DesignPattern.Strategy.Solution.strategy;

// Concrete strategy - for PayPal payment
public class PayPalPayment implements PaymentStrategy {

    private final String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using paypal email id: " + emailId);
    }
}
