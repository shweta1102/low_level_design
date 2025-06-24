package java.main.parking.strategy.fee;

import java.main.parking.model.Ticket;

public class HourBasedFeeCalculation implements FeeCalculation {
    private static final int RATE_PER_HOUR = 10;

    public double calculateFee(Ticket ticket) {
        long exitTime = System.currentTimeMillis();
        //assuming entry time will be set always and will be less than exit time
        return RATE_PER_HOUR * (exitTime - ticket.getEntryTime());
    }
}
