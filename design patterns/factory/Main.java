import vehicles.Vehicle;

public class Main {
    public static void main(String[] args){
        String vehicleType = "car";
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        vehicle.start();
        vehicle.stop();
    }
}
