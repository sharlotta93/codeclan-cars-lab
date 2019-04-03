package ArnoldCodeClan.Vehicles;

public class Car extends Vehicle{

    String model;

    public Car(String make, double price, IEngine engine, String model) {
        super(make, price, engine);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
