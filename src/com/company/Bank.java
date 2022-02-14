package com.company;

public class Bank {
    private String name;
    private int cashInVault;

    public void setName(String branchName) {
        name = branchName;
    }

    public String getName() {
        return name;
    }

    public void setCashInVault( int balance) {
        cashInVault = balance;
    }

    public int getCashInVault() {
        return cashInVault;
    }

    public void deposit(int depositAmount) {
        cashInVault = (cashInVault + depositAmount);
        System.out.println("Additional funds of " + depositAmount + " have been added."
                + "The new balance of the account for " + name + " is " + cashInVault);
    }

    public void withdrawal(int withdrawnAmount) {
        cashInVault = cashInVault - withdrawnAmount;

        System.out.println("Funds in the amount of " + withdrawnAmount + " have been subtracted."
                + "The new balance of the account for " + name + " is " + cashInVault);
    }
}
