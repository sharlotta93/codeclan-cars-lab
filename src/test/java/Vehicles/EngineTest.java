package Vehicles;

import ArnoldCodeClan.Vehicles.Engine;
import ArnoldCodeClan.Vehicles.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.DIESEL);
    }

    @Test
    public void hasEngineType() {
        assertEquals("Diesel", engine.getEngineType());
    }
}
