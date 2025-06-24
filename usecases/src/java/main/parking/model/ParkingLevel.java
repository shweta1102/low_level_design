package src.java.main.parking.model;

import src.java.main.parking.model.vehicle.VehicleType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLevel {
    private final int id;
    private Map<VehicleType, List<ParkingSlot>> slots;

    public ParkingLevel(int id) {
        this.id = id;
        slots = HashMap.newHashMap(10);
    }

    public int getId() {
        return id;
    }

    public Map<VehicleType, List<ParkingSlot>> getSlots() {
        return slots;
    }

    public void addParkingSlot(ParkingSlot slot) {
        slots.putIfAbsent(slot.getType(), new ArrayList<>());
        slots.get(slot.getType()).add(slot);
    }

    public synchronized List<ParkingSlot> getAvailableParkingSlots(VehicleType type) {
        return slots.get(type).stream().filter(ParkingSlot::isAvailable).toList();
    }
}
