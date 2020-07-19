package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest
{
    @Test
    public void basicSavingsAccountFunctions()
    {
        SavingsAccount s = new SavingsAccount("Aaron", "asdlfkj", 12345, 500.0);

        String name = "Aaron";
        String expectedName = s.getName();

        String password = "asdlfkj";
        String expectPassword = s.getPassword();

        int accountNumber = 12345;
        int expectAccountNumber = s.getAccountNumber();

        double amt = 500.0;
        double expecteAmt = s.getBalance();

        Assert.assertEquals(name, expectedName);
        Assert.assertEquals(password, expectPassword);
        Assert.assertEquals(accountNumber, expectAccountNumber);
        Assert.assertEquals(amt, expecteAmt, 0);
    }

    @Test
    public void testDeposit()
    {
        SavingsAccount s = new SavingsAccount("Aaron", "asdlfkj", 12345, 500.0);
        s.deposit(250);

        double newVal = 750;
        double realVal = s.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }

    @Test
    public void testWithdraw()
    {
        SavingsAccount s = new SavingsAccount("Aaron", "asdlfkj", 12345, 500.0);
        s.withdraw(200);

        double newVal = 300;
        double realVal = s.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }
}
