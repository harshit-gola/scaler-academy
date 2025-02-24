package org.scaler.practise;

import java.io.Serializable;
import java.util.Collection;

public class BankAccount {
    private double balance;
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        }
        setBalance(getBalance() + amount);
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        }
        if (balance < amount) {
            System.out.println("Insufficient balance");
        }
        setBalance(getBalance() - amount);
    }
}


