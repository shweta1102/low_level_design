package src.java.main.parking.model.vehicle;

public class Car extends Vehicle {
    VehicleType type;
    String numberPlate;

    public Car(String numberPlate) {
        super(VehicleType.CAR, numberPlate);
    }
}
