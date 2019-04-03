package Dealership;

import ArnoldCodeClan.Dealership.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TillTest {

    Till till;

    @Before
    public void before() {
        till = new Till(1000.00);
    }

    @Test
    public void hasCash() {
        assertEquals(1000.00, till.totalTillValue(), 2);
    }

    @Test
    public void canSell() {
        till.sell(1000.00);
        assertEquals(2000.00, till.totalTillValue(), 2);
    }

    @Test
    public void canBuy() {
        till.buy(500.00);
        assertEquals(500.00, till.totalTillValue(), 2);
    }

    @Test
    public void cannotBuyPriceTooHigh() {
        till.buy(1500.00);
        assertEquals(1000.00, till.totalTillValue(), 2);
    }
}
