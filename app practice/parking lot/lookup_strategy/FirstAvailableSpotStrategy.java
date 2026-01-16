package lookup_strategy;

import java.util.List;

import entity.ParkingSpot;

public class FirstAvailableSpotStrategy implements ParkingSpotLookupStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> spots){
        for(ParkingSpot spot: spots){
            if(spot.getIsEmpty()){
                return spot;
            }
        }
        return null;
    }
}
