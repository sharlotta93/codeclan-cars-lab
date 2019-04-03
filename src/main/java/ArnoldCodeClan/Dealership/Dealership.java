package ArnoldCodeClan.Dealership;

import ArnoldCodeClan.Customer.Customer;
import ArnoldCodeClan.Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Till till;
    private ArrayList availableCars;
    private ArrayList customerList;

    public Dealership(Till till) {
        this.till = till;
        this.availableCars = new ArrayList<Vehicle>();
        this.customerList = new ArrayList<Customer>();
    }


    public void add(Vehicle vehicle) {
        availableCars.add(vehicle);
    }

    public int totalVehicles() {
        return availableCars.size();
    }


    public int totalCustomer() {
        return customerList.size();
    }

    public double totalTill() {
        return till.totalTillValue();
    }

    public void buy(Vehicle vehicle) {
        if (till.totalTillValue() > vehicle.getPrice()) {
            availableCars.add(vehicle);
            till.buy(vehicle.getPrice());
        }
    }

    public void repair(Vehicle vehicle, double repairCost) {
        if (till.totalTillValue() > repairCost) {
            till.buy(repairCost);
            vehicle.changePrice(repairCost);
        }
    }

    public void removeSpecificVehicle(Vehicle vehicle) {

    }

    public void sell(Vehicle vehicle, Customer customer) {
        if (customer.validLicense() && customer.totalCash() >= vehicle.getPrice()) {
            removeCarAddCustomer(vehicle, customer);
            customer.pay(vehicle.getPrice());
            till.sell(vehicle.getPrice());
        }
    }

    public void rent(Vehicle vehicle, Customer customer, double rentalCost) {
        if (customer.validLicense() && customer.totalCash() >= rentalCost && vehicle.isForRent()) {
            removeCarAddCustomer(vehicle, customer);
            customer.pay(rentalCost);
            till.sell(rentalCost);
        }
    }

    public void removeCarAddCustomer(Vehicle vehicle, Customer customer) {
        int vehicleIndex = availableCars.indexOf(vehicle);
        if (vehicleIndex != -1) {
            availableCars.remove(vehicleIndex);
        }

        customerList.add(customer);
    }
}
