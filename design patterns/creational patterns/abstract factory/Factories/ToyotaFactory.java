package Factories;

import Cars.Toyota;
import Interfaces.CarFactory;
import Interfaces.Vehicle;

public class ToyotaFactory implements CarFactory{
    @Override
    public Vehicle createVehicle(){
        return new Toyota();
    }
}
