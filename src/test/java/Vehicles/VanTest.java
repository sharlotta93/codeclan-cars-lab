package Vehicles;

import ArnoldCodeClan.Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VanTest {

    Van van;
    IEngine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.DIESEL);
        van = new Van(VehicleBrand.SUZUKI, 3000.00, engine);
    }

    @Test
    public void hasMake() {
        assertEquals("Suzuki", van.getMake());
    }

    @Test
    public void hasPrice() {
        assertEquals(3000.00, van.getPrice(), 2);
    }

    @Test
    public void canChangePrice() {
        van.changePrice(-500.00);
        assertEquals(2500.00, van.getPrice(), 2);
    }

    @Test
    public void canChangePriceToHigher() {
        van.changePrice(500.00);
        assertEquals(3500.00, van.getPrice(), 2);
    }

    @Test
    public void hasEngineType() {
        assertEquals("Diesel", van.getEngine());
    }

    @Test
    public void hasRentalState() {
        van.setRentalState(true);
        assertTrue(van.isForRent());
    }

    @Test
    public void hasFalseRentalState() {
        assertFalse(van.isForRent());
    }
}
