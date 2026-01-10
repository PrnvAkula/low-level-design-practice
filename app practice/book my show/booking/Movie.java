package booking;

public class Movie {
    private int movieId;
    private String movieName;
    private int movieDurationInMinutes;
    // can add other attributes like genre, director, etc.

    public int getMovieId(){
        return movieId;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getMovieDurationInMinutes(){
        return movieDurationInMinutes;
    }

    public void setMovieDurationInMinutes(int movieDurationInMinutes){
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
}
