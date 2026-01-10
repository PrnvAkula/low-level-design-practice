import booking.MovieController;
import booking.TheatreController;
import booking.Movie;
import booking.Theatre;
import enums.City;

public class BookMyShowApp {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShowApp(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args){
        BookMyShowApp bookMyShowApp = new BookMyShowApp();
        bookMyShowApp.initialize();
    }

    private void initialize(){
        createMovies();
        createTheatres();
    }

    private void createMovies(){
        Movie movie1 = new Movie();
        movie1.setMovieId(1);
        movie1.setMovieName("Bahubali");
        movie1.setMovieDurationInMinutes(180);

        Movie movie2 = new Movie();
        movie2.setMovieId(2);
        movie2.setMovieName("Athadu");
        movie2.setMovieDurationInMinutes(164);

        Movie movie3 = new Movie();
        movie3.setMovieId(3);
        movie3.setMovieName("Khaleja");
        movie3.setMovieDurationInMinutes(145);

        movieController.addMovie(movie1, City.HYDERABAD);
        movieController.addMovie(movie1, City.BANGALORE);
        movieController.addMovie(movie1, City.CHENNAI);
        movieController.addMovie(movie1, City.MUMBAI);

        movieController.addMovie(movie2, City.HYDERABAD);

        movieController.addMovie(movie3, City.HYDERABAD);
        movieController.addMovie(movie3, City.BANGALORE);
    }

    private void createTheatres(){
        Theatre theatre1 = new Theatre();
        theatre1.setTheatreId(1);
        theatre1.setTheatreAddress("RTC Cross Roads");
        theatre1.setTheatreName("Sudharshan 35mm");
        theatre1.setCity(City.HYDERABAD);

        Theatre theatre2 = new Theatre();
        theatre2.setTheatreId(2);
        theatre2.setTheatreAddress("Marathahalli");
        theatre2.setTheatreName("Innovative Multiplex");
        theatre2.setCity(City.BANGALORE);

        theatreController.addTheatre(theatre1, City.HYDERABAD);
        theatreController.addTheatre(theatre2, City.BANGALORE);
    }


}
