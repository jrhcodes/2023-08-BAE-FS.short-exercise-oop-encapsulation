package com.techreturners.encapsulation.bankaccount.model;

public class SecureBankAccount {

    private final String accountNumber;
    private int accountBalance;

    public SecureBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public void depositAmount(int amount) {
        accountBalance += amount;
        addReward();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void debitAmount (int amount) {
        accountBalance -= amount;
    }

    private void addReward() {
        int REWARDAMOUNT = 50;
        accountBalance += REWARDAMOUNT;
    }
}
