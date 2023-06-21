package ru.netology.test;

import ru.netology.CashBackHack;
public class CashBackHackTest {
    @org.junit.Test
    public void testForPurchaseOn1500() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1_500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn1() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn0() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn1000() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn999() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testForPurchaseOn1001() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testForPurchaseOn2000() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1500() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1_500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn0() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1000() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn999() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn1001() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void junit5testForPurchaseOn2000() {
        CashBackHackTest service = new CashBackHackTest();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }
}

