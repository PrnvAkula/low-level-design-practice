package booking;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import enums.City;

public class TheatreService {
    private Map<City, List<Theatre>> cityVsTheatres;
    private List<Theatre> allTheatres;

    public TheatreService(){
        cityVsTheatres = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public  void addTheatre(Theatre theatre, City city){
        List<Theatre> theatresInCity = cityVsTheatres.getOrDefault(city, new ArrayList<>());
        theatresInCity.add(theatre);
        allTheatres.add(theatre);
        cityVsTheatres.put(city, theatresInCity);
    }

    public void removeTheatre(Theatre theatre, City city){
        List<Theatre> theatresInCity = cityVsTheatres.getOrDefault(city, null);

        if(theatresInCity != null){
            theatresInCity.remove(theatre);
            allTheatres.remove(theatre);
            cityVsTheatres.put(city, theatresInCity);
        }
        else{
            System.out.println("No theatre found in the city: " + city + " with the name:" + theatre.getTheatreName());
        }
    }

    public void updateTheatre(Theatre oldTheatre, Theatre newTheatre, City city){
        removeTheatre(oldTheatre, city);
        addTheatre(newTheatre, city);
    }

    public List<Theatre> getTheatresByCity(City city){
        return cityVsTheatres.getOrDefault(city, null);
    }

    public Theatre getTheatreByName(String theatreName){
        for(Theatre theatre: allTheatres){
            if(theatre.getTheatreName().equals(theatreName)){
                return theatre;
            }
        }
        return null;
    }
}
