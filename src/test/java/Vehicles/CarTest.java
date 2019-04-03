package Vehicles;

import ArnoldCodeClan.Vehicles.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    Car car;
    IEngine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.HYBRID);
        car = new Car(VehicleBrand.HONDA, 2000.00, engine, "Civic");
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

    @Test
    public void canChangeEngine() {
        IEngine newEngine = new Engine(EngineType.ELECTRIC);
        car.changeEngine(newEngine);
        assertEquals("Electric", car.getEngine());
    }
}
