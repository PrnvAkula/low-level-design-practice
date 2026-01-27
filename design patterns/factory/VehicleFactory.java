import vehicles.Bike;
import vehicles.Car;
import vehicles.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("car")){
            return new Car();
        }
        else if(vehicleType.equals("bike")){
            return new Bike();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
