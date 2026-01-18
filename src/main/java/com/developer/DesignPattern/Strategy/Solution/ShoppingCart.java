package com.developer.DesignPattern.Strategy.Solution;

import com.developer.DesignPattern.Strategy.Solution.strategy.PaymentStrategy;

// Context class - holds reference to a strategy object
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        System.out.print(this.paymentStrategy.getClass().getSimpleName() + ": ");
        paymentStrategy.pay(amount);
    }
}
