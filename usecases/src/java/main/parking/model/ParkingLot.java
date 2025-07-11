package src.java.main.parking.model;

import src.java.main.parking.model.vehicle.Vehicle;
import src.java.main.parking.strategy.fee.FeeCalculation;
import src.java.main.parking.strategy.fee.HourBasedFeeCalculation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private final List<ParkingLevel> levels;
    private final FeeCalculation feeCalculation;
    private Map<String, Ticket> activeTickets;

    private ParkingLot() {
        levels = new ArrayList<>();
        feeCalculation = new HourBasedFeeCalculation();
        activeTickets = HashMap.newHashMap(10);
    }

    private static final class InstanceHolder {
        private static final ParkingLot instance = new ParkingLot();
    }

    public static ParkingLot getInstance() {
        return InstanceHolder.instance;
    }

    public boolean addLevel(ParkingLevel level) {
        this.levels.add(level);
        return true;
    }

    public synchronized String parkVehicle(Vehicle vehicle) throws Exception {
        //get the first available slot
        ParkingSlot slot = null;
        for (ParkingLevel level : levels) {
            List<ParkingSlot> availableSlots = level.getAvailableParkingSlots(vehicle.getType());
            if (!availableSlots.isEmpty()) {
                slot = availableSlots.getFirst();
                //park vehicle
                System.out.println("Slot available "+ slot.getSlotNumber());
                slot.setAvailable(false);
                Ticket ticket = new Ticket(vehicle, slot, System.currentTimeMillis());
                //generate ticket and return ticket number
                activeTickets.put(ticket.getTicketId(), ticket);
                System.out.println("Ticket Generated" + ticket.getTicketId());
                return ticket.getTicketId();
            }
        }
        throw new Exception("No available spot for " + vehicle.getType());
    }

    public synchronized double unParkVehicle(Ticket ticket) {
        // calculate fee
        double fee = feeCalculation.calculateFee(ticket);
        //remove ticket from active tickets
        activeTickets.remove(ticket.getTicketId());
        //mark slot as available
        ticket.getParkingSlot().setAvailable(true);
        return fee;
    }

}
