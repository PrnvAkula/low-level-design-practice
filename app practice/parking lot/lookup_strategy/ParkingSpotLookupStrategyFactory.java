package lookup_strategy;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotLookupStrategyFactory {
    private static final Map<String, ParkingSpotLookupStrategy> strategies = new HashMap<>();
    static {
        strategies.put("firstAvailable", new FirstAvailableSpotStrategy());
        strategies.put("nearest", new NearestAvailableSpotStrategy());
    }

    public static ParkingSpotLookupStrategy getStrategy(String type){
        return strategies.get(type);
    }
}