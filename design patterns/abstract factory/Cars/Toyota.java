package Cars;

import Interfaces.Vehicle;

public class Toyota implements Vehicle{
    @Override
    public void start(){
        System.out.println("Toyota is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Toyota is stoping...");
    }
}

