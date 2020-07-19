package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest
{
    @Test
    public void basicBusinessAcountTest()
    {
        BusinessAccount s = new BusinessAccount("Aaron LTD", 12345, 500.0, "12345", 123456);

        String name = "Aaron LTD";
        String expectedName = s.getCompany();

        String password = "12345";
        String expectPassword = s.getPassword();

        int accountNumber = 123456;
        int expectAccountNumber = s.getAccountNumber();

        double amt = 500.0;
        double expecteAmt = s.getBalance();

        int taxId = 12345;
        int expectedTaxId = 12345;

        Assert.assertEquals(name, expectedName);
        Assert.assertEquals(password, expectPassword);
        Assert.assertEquals(accountNumber, expectAccountNumber);
        Assert.assertEquals(amt, expecteAmt, 0);
        Assert.assertEquals(taxId, expectedTaxId);
    }

    @Test
    public void testDeposit()
    {
        BusinessAccount s = new BusinessAccount("Aaron LTD", 12345, 500.0, "12345", 123456);

        s.deposit(250);

        double newVal = 750;
        double realVal = s.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }

    @Test
    public void testWithdraw()
    {
        BusinessAccount s = new BusinessAccount("Aaron LTD", 12345, 500.0, "12345", 123456);

        s.withdraw(200);

        double newVal = 300;
        double realVal = s.getBalance();

        Assert.assertEquals(newVal, realVal, 0);
    }

}
