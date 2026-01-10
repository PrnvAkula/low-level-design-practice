package booking;

import enums.City;
import java.util.List;
import java.util.ArrayList;


public class Theatre {
    private int theatreId;
    private String theatreName;
    private String theatreAddress;
    private City city;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(){
        screens = new ArrayList<>();
        shows = new ArrayList<>();
    }

    public int getTheatreId(){
        return theatreId;
    }

    public void setTheatreId(int theatreId){
        this.theatreId = theatreId;
    }

    public String getTheatreName(){
        return theatreName;
    }

    public void setTheatreName(String theatreName){
        this.theatreName = theatreName;
    }

    public String getTheatreAddress(){
        return theatreAddress;
    }

    public void setTheatreAddress(String theatreAdress){
        this.theatreAddress = theatreAdress;
    }

    public City getCity(){
        return city;
    }

    public void setCity(City city){
        this.city = city;
    }

    public List<Screen> getScreens(){
        return screens;
    }

    public void setScreens(List<Screen> screens){
        this.screens = screens;
    }

    public List<Show> getShows(){
        return shows;
    }

    public void setShows(List<Show> shows){
        this.shows = shows;
    }
}
