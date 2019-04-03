package ArnoldCodeClan.Vehicles;

public enum EngineType {

    HYBRID("Hybrid"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");

    private final String engineName;

    EngineType(String engineName) {
        this.engineName = engineName;
    }

    public String getEngine() {
        return this.engineName;
    }
}
