package Vehicles;

import ArnoldCodeClan.Vehicles.IEngine;
import org.junit.Before;
import org.junit.Test;
import ArnoldCodeClan.Vehicles.Car;
import ArnoldCodeClan.Vehicles.Engine;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    Car car;
    IEngine engine;

    @Before
    public void before() {
        engine = new Engine("Hybrid");
        car = new Car("Honda", 2000.00, engine, "Civic");
    }

    @Test
    public void hasMake() {
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000.00, car.getPrice(), 2);
    }

    @Test
    public void hasModel() {
        assertEquals("Civic", car.getModel());
    }

    @Test
    public void hasEngineType() {
        assertEquals("Hybrid", car.getEngine());
    }

    @Test
    public void hasRentalState() {
        car.setRentalState(true);
        assertTrue(car.isForRent());
    }

    @Test
    public void hasFalseRentalState() {
        assertFalse(car.isForRent());
    }
}
