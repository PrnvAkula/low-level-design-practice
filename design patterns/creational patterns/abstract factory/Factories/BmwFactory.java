package Factories;

import Cars.Bmw;
import Interfaces.CarFactory;
import Interfaces.Vehicle;

public class BmwFactory implements CarFactory{
    @Override
    public Vehicle createVehicle(){
        return new Bmw();
    }
}
