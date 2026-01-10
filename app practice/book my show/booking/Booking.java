package booking;

import java.util.List;
import enums.BookingStatus;

public class Booking {
    private int bookingId;
    private Show show;
    private int userId;
    private List<Seat> bookedSeats;
    private Payment payment;
    private BookingStatus bookingStatus;

    public int getBookingId(){
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public Show getShow(){
        return show;
    }

    public void setShow(Show show){
        this.show = show;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public List<Seat> getBookedSeats(){
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats){
        this.bookedSeats = bookedSeats;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public BookingStatus getBookingStatus(){
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus){
        this.bookingStatus = bookingStatus;
    }
}
