package lookup_strategy;

import java.util.List;

import entity.ParkingSpot;

public interface ParkingSpotLookupStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}
