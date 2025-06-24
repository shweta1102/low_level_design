package java.main.parking;

import java.main.parking.model.ParkingLevel;
import java.main.parking.model.ParkingLot;
import java.main.parking.model.ParkingSlot;
import java.main.parking.model.vehicle.*;

public class ParkingLotDemo {
    public static void main(String[] args) {
        // start parking lot
        ParkingLot parkingLot = ParkingLot.getInstance();

        //create parking slots
        ParkingLevel level1 = new ParkingLevel(1);
        //add check later to make sure slot numbers should be unique
        level1.addParkingSlot(new ParkingSlot(VehicleType.BIKE,101));
        level1.addParkingSlot(new ParkingSlot(VehicleType.CAR,102));
        level1.addParkingSlot(new ParkingSlot(VehicleType.TRUCK,103));

        ParkingLevel level2 = new ParkingLevel(2);
        //add check later to make sure slot numbers should be unique
        level2.addParkingSlot(new ParkingSlot(VehicleType.BIKE,201));
        level2.addParkingSlot(new ParkingSlot(VehicleType.CAR,202));
        level2.addParkingSlot(new ParkingSlot(VehicleType.TRUCK,203));

        parkingLot.addLevel(level1);
        parkingLot.addLevel(level2);

        //define vehicles to park
        Vehicle car = new Car("123");
        Vehicle bike = new Bike("123");
        Vehicle truck = new Truck("123");
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(car);

    }
}
