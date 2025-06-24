package java.main.parking.model.vehicle;

public class Truck extends Vehicle {
    VehicleType type;
    String numberPlate;

    public Truck(String numberPlate) {
        super(VehicleType.TRUCK, numberPlate);
    }
}
