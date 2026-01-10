package booking;

import enums.SeatCategory;

public class Seat {
    private int seatId;
    private SeatCategory seatCategory;
    int price;

    public int getSeatId(){
        return seatId;
    }

    public void setSeatId(int seatId){
        this.seatId = seatId;
    }

    public SeatCategory getSeatCategory(){
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory){
        this.seatCategory = seatCategory;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
