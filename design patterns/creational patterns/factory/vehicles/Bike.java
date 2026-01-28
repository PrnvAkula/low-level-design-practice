package vehicles;

public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("bike is starting...");
    }

    @Override
    public void stop(){
        System.out.println("bike is stopping...");
    }
}
