package java.main.parking.model;

import java.main.parking.model.vehicle.Vehicle;
import java.util.UUID;

public class Ticket {
    private final Vehicle vehicle;
    private final ParkingSlot parkingSlot;
    private final String ticketId;
    private final long entryTime;

    public Ticket(Vehicle vehicle, ParkingSlot parkingSlot, long entryTime) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public String getTicketId() {
        return ticketId;
    }
}
