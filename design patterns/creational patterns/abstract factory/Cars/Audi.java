package Cars;

import Interfaces.Vehicle;

public class Audi implements Vehicle{
    @Override
    public void start(){
        System.out.println("Audi is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Audi is stoping...");
    }
}
