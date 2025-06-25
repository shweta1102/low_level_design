package src.java.main.vending_machine.service;

import src.java.main.vending_machine.model.VendingMachine;
import src.java.main.vending_machine.model.VendingMachineState;

public class IdleStateService implements VendingMachineStateService{
    @Override
    public VendingMachineState action(VendingMachine context) {
        return null;
    }
}
