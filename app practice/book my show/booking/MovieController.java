package booking;

import enums.City;
import java.util.List;




public class MovieController {
    private MovieService movieService;

    public MovieController(){
        this.movieService = new MovieService();
    }

    public void addMovie(Movie movie, City city){
        movieService.addMovie(movie, city);
    }

    public void removeMovie(Movie movie, City city){
        movieService.removeMovie(movie, city);
    }

    public void updateMovie(Movie oldMovie, Movie newMovie, City city){
        movieService.updateMovie(oldMovie, newMovie, city);
    }

    public List<Movie> getMoviesByCity(City city){
        return movieService.getMoviesByCity(city);
    }

    public Movie getMovieByName(String movieName){
        return movieService.getMovieByName(movieName);
    }
}