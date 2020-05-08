package com.company;

public class BankAccount {
    private double amount;

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Your balance = " + amount + " KGS ");
        return amount;
    }

    public double withDraw(int sum) throws LimitException {
        amount = amount - sum;
        System.out.println("Your remaining = " + amount + " KGS ");
        if (sum > amount) {
            throw new LimitException("In your account not enought funds = ", amount);

        }
        return amount;
    }

    public double getAmount() {
        return amount;
    }
}
