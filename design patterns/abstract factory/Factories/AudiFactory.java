package Factories;

import Cars.Audi;
import Interfaces.CarFactory;
import Interfaces.Vehicle;

public class AudiFactory implements CarFactory{
    @Override
    public Vehicle createVehicle(){
        return new Audi();
    }
}
