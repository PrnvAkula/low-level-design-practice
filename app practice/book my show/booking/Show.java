package booking;

import java.util.List;

public class Show {
    private int showId;
    private String showStartTime;
    private Movie movie;
    private Screen screen;
    private List<Seat> bookedSeats;

    public int getShowId(){
        return showId;
    }

    public void setShowId(int showId){
        this.showId = showId;
    }

    public String getShowStartTime(){
        return showStartTime;
    }

    public void setShowStartTime(String showStartTime){
        this.showStartTime = showStartTime;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public Screen getScreen(){
        return screen;
    }

    public void setScreen(Screen screen){
        this.screen = screen;
    }

    public List<Seat> getBookedSeats(){
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats){
        this.bookedSeats = bookedSeats;
    }
}
