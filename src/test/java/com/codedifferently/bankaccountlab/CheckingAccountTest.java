package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest
{
    @Test
    public void basicCheckingAccountFunctions()
    {
        CheckingAccount c = new CheckingAccount("Aaron", "asdlfkj", 12345, 500.0);

        String name = "Aaron";
        String expectedName = c.getName();

        String password = "asdlfkj";
        String expectPassword = c.getPassword();

        int accountNumber = 12345;
        int expectAccountNumber = c.getAccountNumber();

        double amt = 500.0;
        double expecteAmt = c.getBalance();

        Assert.assertEquals(name, expectedName);
        Assert.assertEquals(password, expectPassword);
        Assert.assertEquals(accountNumber, expectAccountNumber);
        Assert.assertEquals(amt, expecteAmt, 0);
    }

    @Test
    public void testDeposit()
    {
        CheckingAccount c = new CheckingAccount("Aaron", "asdlfkj", 12345, 500.0);
        c.deposit(250);

        double newVal = 750;
        double realVal = c.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }

    @Test
    public void testWithdraw()
    {
        CheckingAccount c = new CheckingAccount("Aaron", "asdlfkj", 12345, 500.0);
        c.withdraw(200);

        double newVal = 300;
        double realVal = c.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }
}
