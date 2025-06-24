package src.java.main.parking.model.vehicle;

public abstract class Vehicle {
    VehicleType type;
    String numberPlate;

    public Vehicle(VehicleType vehicleType, String numberPlate) {
        this.numberPlate = numberPlate;
        this.type = vehicleType;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
