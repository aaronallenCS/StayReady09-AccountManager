package com.codedifferently.bankaccountlab;

import java.util.Scanner;

public class CheckingAccount extends BankAccount
{
    private String name;
    private int accountNumber;
    private String password;


    public CheckingAccount(String name, String password, int accountNumber, double initialDeposit)
    {
        super(123456789, initialDeposit, 10.0);
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountNumber(int acctNumber)
    {
        this.accountNumber = acctNumber;
    }
}
