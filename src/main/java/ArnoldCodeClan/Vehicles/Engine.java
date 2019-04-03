package ArnoldCodeClan.Vehicles;

public class Engine implements IEngine{

    private EngineType type;

    public Engine(EngineType type) {
        this.type = type;
    }

    public String getEngineType() {
        return type.getEngine();
    }
}
