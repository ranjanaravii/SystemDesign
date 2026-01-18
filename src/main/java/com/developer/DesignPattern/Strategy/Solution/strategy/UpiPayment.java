package com.developer.DesignPattern.Strategy.Solution.strategy;

// Concrete strategy - for UPI payment
public class UpiPayment implements PaymentStrategy{

    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID : " + upiId);
    }
}
