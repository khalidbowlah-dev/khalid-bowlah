package com.foodordering;

public class CashPayment extends Payment {
    private double cashTendered;

    public CashPayment(double amount, double cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    @Override
    public void processPayment() {
        System.out.println("com.foodordering.Payment Type: CASH");
        if (cashTendered >= amount) {
            System.out.println("Total: $" + amount);
            System.out.println("Change: $" + (cashTendered - amount));
        } else {
            System.out.println("Error: Insufficient cash.");
        }
    }
}
