package src.java.main.parking.model.vehicle;

public class Bike extends Vehicle {
    VehicleType type;
    String numberPlate;

    public Bike(String numberPlate) {
        super(VehicleType.BIKE, numberPlate);
    }
}
