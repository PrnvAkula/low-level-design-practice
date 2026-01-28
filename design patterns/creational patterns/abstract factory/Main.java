import Factories.AudiFactory;
import Factories.BmwFactory;
import Interfaces.Vehicle;

public class Main {
    public static void main(String[] args){
        BmwFactory bmwFactory = new BmwFactory();
        Vehicle Bmw = bmwFactory.createVehicle();

        AudiFactory audiFactory = new AudiFactory();
        Vehicle Audi = audiFactory.createVehicle();

        Bmw.start();
        Bmw.stop();

        Audi.start();
        Audi.stop();
    }
}
