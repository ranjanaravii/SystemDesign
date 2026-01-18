package com.developer.DesignPattern.Strategy.Problem;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {
        switch (paymentMethod) {
            case "credit_card" ->
                    System.out.println("Paid $" + amount + " using credit card");
            case "upi" ->
                    System.out.println("Paid $" + amount + " using upi");
            case "paypal" ->
                    System.out.println("Paid $" + amount + " using paypal");
            case "cash" ->
                    System.out.println("Paid $" + amount + " cash");
            default -> throw new IllegalArgumentException("Unexpected value: " + paymentMethod);

            // Adding another payment method requires modifying this class
        }
    }
}
