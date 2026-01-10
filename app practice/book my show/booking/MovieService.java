package booking;

import enums.City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class MovieService {
    private Map<City, List<Movie>> cityVsMovies;
    private List<Movie> allMovies;

    public MovieService(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city){
        List<Movie> moviesInCity = cityVsMovies.getOrDefault(city, new ArrayList<>());
        moviesInCity.add(movie);
        allMovies.add(movie);
        cityVsMovies.put(city, moviesInCity);
    }

    public void removeMovie(Movie movie, City city){
        List<Movie> moviesInCity = cityVsMovies.getOrDefault(city, null);

        if(moviesInCity != null){
            moviesInCity.remove(movie);
            allMovies.remove(movie);
            cityVsMovies.put(city, moviesInCity);
        }
        else{
            System.out.println("No movie found in the city: " + city + " with the name:" + movie.getMovieName());
        }
    }

    public void updateMovie(Movie oldMovie, Movie newMovie,City city){
        removeMovie(oldMovie, city);
        addMovie(newMovie, city);
    }

    public List<Movie> getMoviesByCity(City city){
        return cityVsMovies.getOrDefault(city, null);
    }

    public Movie getMovieByName(String movieName){
        for(Movie movie: allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
}
