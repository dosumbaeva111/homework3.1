package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
	bankAccount.deposit(10000);
	while (true){
        try {
            bankAccount.withDraw(6000);
        } catch (LimitException e) {
            double result = e.getRemainingAmount()-bankAccount.getAmount();
            System.out.println("You withdraw the account balance = " + e.getRemainingAmount()+result);
            break;
        }
    }
    }
}
