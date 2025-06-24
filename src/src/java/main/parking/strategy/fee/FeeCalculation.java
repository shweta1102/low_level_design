package java.main.parking.strategy.fee;

import java.main.parking.model.Ticket;

public interface FeeCalculation {
    double calculateFee(Ticket ticket);
}
