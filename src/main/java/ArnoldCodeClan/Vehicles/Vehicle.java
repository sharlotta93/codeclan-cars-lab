package ArnoldCodeClan.Vehicles;

public abstract class Vehicle {

    private String make;
    private double price;
    private IEngine engine;
    private boolean forRent;

    public Vehicle(String make, double price, IEngine engine) {
        this.make = make;
        this.price = price;
        this.engine = engine;
        this.forRent = false;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public double changePrice(double cost) {
        return price += cost;
    }

    public String getEngine() {
        return engine.getEngineType();
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setRentalState(boolean newRentalState) {
        forRent = newRentalState;
    }

}
