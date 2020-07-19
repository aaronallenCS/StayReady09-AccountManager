package com.codedifferently.bankaccountlab;


public class SavingsAccount extends BankAccount
{
    private String name;
    private double rate;
    private int accountNumber;
    private String password;


    public SavingsAccount(String name, String password, int accountNumber, double initialDeposit)
    {
        super(123456789, initialDeposit, 0.0);
        this.name = name;
        this.rate = rate;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double getRate()
    {
        return  this.rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int acctNumber)
    {
        this.accountNumber = accountNumber;
    }
}
