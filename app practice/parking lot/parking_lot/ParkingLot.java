package parking_lot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.ParkingSpot;
import entity.Ticket;
import enums.VehicleType;
import spot_managers.ParkingSpotManager;

public class ParkingLot {
    private final List<ParkingSpot> twoWheelerSpots;
    private final List<ParkingSpot> fourWheelerSpots;
    private final ParkingSpotManager twoWheelerManager;
    private final ParkingSpotManager fourWheelerManager;
    private final Map<String, Ticket> ticketRegistry;

    public ParkingLot(List<ParkingSpot> twoWheelerSpots, List<ParkingSpot> fourWheelerSpots){
        this.twoWheelerSpots = twoWheelerSpots;
        this.fourWheelerSpots = fourWheelerSpots;
        this.twoWheelerManager = new ParkingSpotManager(twoWheelerSpots);
        this.fourWheelerManager = new ParkingSpotManager(fourWheelerSpots);
        this.ticketRegistry = new HashMap<>();
    }

    public ParkingSpotManager getManager(VehicleType vehicleType){
        return vehicleType == VehicleType.TWO_WHEELER? twoWheelerManager : fourWheelerManager;
    }

    public List<ParkingSpot> getTwoWheelerParkingSpots(){
        return twoWheelerSpots;
    }

    public List<ParkingSpot> getFourWheelerParkingSpots(){
        return fourWheelerSpots;
    }

    public void registerTicket(Ticket ticket){
        ticketRegistry.put(ticket.getVehicle().getVehicleNumber(), ticket);
    }

    public Ticket getTicket(String vehicleNumber){
        return ticketRegistry.get(vehicleNumber);
    }

    public void removeTicket(String vehicleNumber){
        ticketRegistry.remove(vehicleNumber);
    }
}
