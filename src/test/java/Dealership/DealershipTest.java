package Dealership;

import ArnoldCodeClan.Customer.Customer;
import ArnoldCodeClan.Dealership.Dealership;
import ArnoldCodeClan.Dealership.Till;
import ArnoldCodeClan.Vehicles.Car;
import ArnoldCodeClan.Vehicles.Engine;
import ArnoldCodeClan.Vehicles.Van;
import ArnoldCodeClan.Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Till till;
    Vehicle car;
    Vehicle van;
    Customer customer;
    Engine goodEngine;
    Engine badEngine;

    @Before
    public void before() {
        till = new Till(20000.00);
        dealership = new Dealership(till);
        goodEngine = new Engine("Hybrid");
        car = new Car("Honda", 2000.00, goodEngine, "Civic");
        badEngine = new Engine("Diesel");
        van = new Van("Suzuki", 3000.00, badEngine);
        customer = new Customer("Bob", 52, true, 3000.00);
    }

    @Test
    public void canAddVehicleToInventory() {
        dealership.add(car);
        dealership.add(van);
        assertEquals(2, dealership.totalVehicles());
    }

    @Test
    public void canSaleVehicleToCustomer() {
        dealership.add(car);
        dealership.add(van);
        dealership.sell(van, customer);
        assertEquals(1, dealership.totalVehicles());
        assertEquals(1, dealership.totalCustomer());
        assertEquals(23000.00, dealership.totalTill(), 2);
        assertEquals(0.00, customer.totalCash(), 2);
    }

    @Test
    public void canBuyVehicle() {
        dealership.buy(car);
        assertEquals(1, dealership.totalVehicles());
        assertEquals(18000.00, dealership.totalTill(), 2);
    }

    @Test
    public void canRepairCar() {
        dealership.add(car);
        dealership.repair(car, 200.00);
        assertEquals(19800.00, dealership.totalTill(), 2);
        assertEquals(2200.00, car.getPrice(), 2);
    }

    @Test
    public void canRentCar() {
        dealership.add(car);
        car.setRentalState(true);
        dealership.rent(car, customer, 300.00);
        assertEquals(0, dealership.totalVehicles());
        assertEquals(1, dealership.totalCustomer());
        assertEquals(20300.00, dealership.totalTill(), 2);
        assertEquals(2700.00, customer.totalCash(), 2);
    }


    @Test
    public void cannotRentCar() {
        dealership.add(car);
        dealership.rent(car, customer, 300.00);
        assertEquals(1, dealership.totalVehicles());
        assertEquals(0, dealership.totalCustomer());
        assertEquals(20000.00, dealership.totalTill(), 2);
        assertEquals(3000.00, customer.totalCash(), 2);
    }

}
