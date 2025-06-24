package java.main.parking.model;

import java.main.parking.model.vehicle.VehicleType;

public class ParkingSlot {
    private VehicleType type;
    private int slotNumber;
    private boolean isAvailable;

    public ParkingSlot(VehicleType type, int slotNumber) {
        this.type = type;
        this.slotNumber = slotNumber;
        this.isAvailable = true;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public synchronized void setAvailable(boolean available) {
        isAvailable = available;
    }
}
