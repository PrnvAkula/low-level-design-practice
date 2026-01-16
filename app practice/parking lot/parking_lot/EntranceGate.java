package parking_lot;

import entity.ParkingSpot;
import entity.Ticket;
import entity.Vehicle;
import spot_managers.ParkingSpotManager;
import lookup_strategy.ParkingSpotLookupStrategyFactory;

public class EntranceGate{
    private final ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public Ticket allocate(Vehicle vehicle){
        ParkingSpotManager manager = parkingLot.getManager(vehicle.getVehicleType());

        manager.setParkingSpotLookupStrategy(ParkingSpotLookupStrategyFactory.getStrategy("firstAvailable"));

        ParkingSpot spot = manager.findParkingSpot();
        if(spot == null) return null;

        spot.parkVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle, spot);
        parkingLot.registerTicket(ticket);
        return ticket;
    }

}
