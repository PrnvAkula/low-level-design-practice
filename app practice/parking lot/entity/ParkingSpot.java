package entity;

public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;

    public ParkingSpot(int id, int price){
        this.id = id;
        this.price = price;
        this.isEmpty = true;
        this.vehicle = null;
    }
     
    public int getId(){
        return id;
    }

    public boolean getIsEmpty(){
        return isEmpty;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public int getPrice(){
        return price;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false; 
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }
}
