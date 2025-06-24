package src.java.main.parking.strategy.fee;

import src.java.main.parking.model.Ticket;

public interface FeeCalculation {
    double calculateFee(Ticket ticket);
}
