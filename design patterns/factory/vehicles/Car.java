package vehicles;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("car is starting...");
    }

    @Override
    public void stop(){
        System.out.println("car is stopping...");
    }
}
