package booking;

import enums.City;

import java.util.List;

public class TheatreController {
    private TheatreService theatreService;

    public TheatreController(){
        this.theatreService = new TheatreService();
    }

    public void addTheatre(Theatre theatre, City city){
        theatreService.addTheatre(theatre, city);
    }

    public void removeTheatre(Theatre theatre, City city){
        theatreService.removeTheatre(theatre, city);
    }

    public void updateTheatre(Theatre oldTheatre, Theatre newTheatre, City city){
        theatreService.updateTheatre(oldTheatre, newTheatre, city);
    }

    public List<Theatre> getTheatresByCity(City city){
        return theatreService.getTheatresByCity(city);
    }

    public Theatre getTheatreByName(String theatreName){
        return theatreService.getTheatreByName(theatreName);
    }
}
