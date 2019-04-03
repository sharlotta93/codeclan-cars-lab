package ArnoldCodeClan.Vehicles;

public class Engine implements IEngine{

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getEngineType() {
        return type;
    }
}
