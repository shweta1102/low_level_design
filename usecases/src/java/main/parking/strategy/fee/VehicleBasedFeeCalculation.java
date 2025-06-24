package src.java.main.parking.strategy.fee;

import src.java.main.parking.model.Ticket;
import src.java.main.parking.model.vehicle.VehicleType;
import java.util.HashMap;
import java.util.Map;

public class VehicleBasedFeeCalculation implements FeeCalculation {

    private static final Map<VehicleType, Integer> vehicleRates = HashMap.newHashMap(3);

    static {
        vehicleRates.put(VehicleType.BIKE, 10);
        vehicleRates.put(VehicleType.CAR, 20);
        vehicleRates.put(VehicleType.TRUCK, 30);
    }

    public double calculateFee(Ticket ticket) {
        return vehicleRates.get(ticket.getVehicle().getType()) == null ? 0 : vehicleRates.get(ticket.getVehicle().getType());
    }
}
