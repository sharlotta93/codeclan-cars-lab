package Customer;

import Customer.*;

import ArnoldCodeClan.Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Bob", 52, true, 3000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(52, customer.getAge());
    }

    @Test
    public void hasValidLicense() {
        assertTrue(customer.validLicense());
    }

    @Test
    public void hasMoney() {
        assertEquals(3000.00, customer.totalCash(), 2);
    }

    @Test
    public void canPay() {
        customer.pay(500.00);
        assertEquals(2500.00, customer.totalCash(), 2);
    }

    @Test
    public void cannotPay() {
        customer.pay(3500.00);
        assertEquals(3000.00, customer.totalCash(), 2);
    }

}
