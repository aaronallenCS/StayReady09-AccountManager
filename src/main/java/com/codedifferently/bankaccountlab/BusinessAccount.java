package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount
{
    private String company;
    private int taxId;
    private int accountNumber;
    private String password;

    public BusinessAccount(String company, int taxId, double initialDeposit, String password, int accountNumber)
    {
        super(123456789, initialDeposit, 0.0);
        this.company = company;
        this.taxId = taxId;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public int getTaxId()
    {
        return taxId;
    }

    public void setTaxId(int taxId)
    {
        this.taxId = taxId;
    }

    public String getPassword()
    {
        return this.password;
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
