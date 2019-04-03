package ArnoldCodeClan.Vehicles;

public enum VehicleBrand {

    HONDA("Honda"),
    SUZUKI("Suzuki"),
    VAUXHALL("Vauxhall"),
    BMW("BMW"),
    MUSTANG("Mustang");

    private final String vehicleType;

    VehicleBrand(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return this.vehicleType;
    }
}
