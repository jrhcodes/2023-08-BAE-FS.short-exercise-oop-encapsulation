package com.techreturners.encapsulation.bankaccount.app;

import com.techreturners.encapsulation.bankaccount.model.DodgyBankAccount;
import com.techreturners.encapsulation.bankaccount.model.SecureBankAccount;

public class Main {

    private static final String MYACCOUNTNUMBER = "ABCDEFG123";

    public static void main(String[] args) {

        //DODGY BANK ACCOUNT
        System.out.println("--- DODGY BANK ACCOUNT ---\n");
        System.out.println("Mmm...I spot a dodgy bank account! Let's make one!");
        DodgyBankAccount myDodgyBankAccount = new DodgyBankAccount(MYACCOUNTNUMBER);

        System.out.println("What is my current balance?");

        System.out.printf("Your account balance is %.2f\n", myDodgyBankAccount.getAccountBalance() / 100.0);

        System.out.println("Let's deposit an amount of 30");
        myDodgyBankAccount.depositAmount(30);
        System.out.printf("Your account balance is %.2f\n", myDodgyBankAccount.getAccountBalance() / 100.0);

        System.out.println("Wow! Looks like we get a reward of 50 when we deposit an amount");

        System.out.println("Let's be naughty and add rewards without depositing!");
        myDodgyBankAccount.addReward();
        myDodgyBankAccount.addReward();
        myDodgyBankAccount.addReward();
        System.out.printf("Your account balance is %.2f\n", myDodgyBankAccount.getAccountBalance() / 100.0);

        System.out.println("Wow! We're rich!");

        System.out.println("Let's make a lot of money right now! Let's change the account balance directly!");
        myDodgyBankAccount.accountBalance = 1000000;
        System.out.printf("Your account balance is %.2f\n", myDodgyBankAccount.getAccountBalance() / 100.0);
        System.out.println("😻 Weeeeee!!!!\n");

        //SECURE BANK ACCOUNT
        System.out.println("--- SECURE BANK ACCOUNT ---\n");
        System.out.println("Mmm...let's make a secure bank account!");
        SecureBankAccount mySecureBankAccount = new SecureBankAccount(MYACCOUNTNUMBER);

        System.out.println("What is my current balance?");

        System.out.printf("Your account balance is %.2f\n", mySecureBankAccount.getAccountBalance() / 100.0);

        System.out.println("Let's deposit an amount of 30");
        mySecureBankAccount.depositAmount(30);
        System.out.printf("Your account balance is %.2f\n", mySecureBankAccount.getAccountBalance() / 100.0);

        System.out.println("Wow! Looks like we get a reward of 50 when we deposit an amount");

        System.out.println("Let's be naughty and add rewards without depositing!");
        System.out.println("Oh no :( It looks like we can't do this - it's too secure!");
        /*mySecureBankAccount.addReward();
        mySecureBankAccount.addReward();
        mySecureBankAccount.addReward();*/
        System.out.printf("Your account balance is %.2f\n", mySecureBankAccount.getAccountBalance() / 100.0);

        System.out.println("Let's make a lot of money right now! Let's change the account balance directly!");
        System.out.println("Oh no :( It looks like we can't do this - it's too secure!");
        //mySecureBankAccount.accountBalance = 1000000;
        System.out.printf("Your account balance is %.2f\n", mySecureBankAccount.getAccountBalance() / 100.0);
        System.out.println("😹 Well I guess that's secure!");
    }

}
