package spot_managers;

import lookup_strategy.ParkingSpotLookupStrategy;

import java.util.List;

import entity.ParkingSpot;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;
    private ParkingSpotLookupStrategy parkingSpotLookupStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    public void setParkingSpotLookupStrategy(ParkingSpotLookupStrategy parkingSpotLookupStrategy){
        this.parkingSpotLookupStrategy = parkingSpotLookupStrategy;
    }

    public ParkingSpot findParkingSpot(){
        return parkingSpotLookupStrategy.findParkingSpot(parkingSpotList);
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }
}
