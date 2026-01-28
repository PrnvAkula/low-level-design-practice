package Cars;

import Interfaces.Vehicle;

public class Bmw implements Vehicle{
    @Override
    public void start(){
        System.out.println("BMW is starting...");
    }

    @Override
    public void stop(){
        System.out.println("BMW is stoping...");
    }
}
