package parking_lot;

import entity.ParkingSpot;
import entity.Ticket;
import payment.Payment;
import payment.pricing.CostComputation;

public class ExitGate {
    private final ParkingLot parkingLot;
    private CostComputation costComputation;

    public ExitGate(ParkingLot parkingLot, CostComputation costComputation){
        this.parkingLot = parkingLot;
        this.costComputation = costComputation;
    }

    public void exit(String vehicleNumber, Payment payment){
        Ticket ticket = parkingLot.getTicket(vehicleNumber);
        double billAmount = costComputation.getBill(ticket);
        boolean paid = payment.pay(billAmount);

        if(!paid){
            throw new RuntimeException("Exit Denied: Payment failure. Please complete paymnt to exit");
        }

        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.removeVehicle();
        parkingLot.removeTicket(vehicleNumber);

        System.out.println("Exit successful"); 
    }
}
