import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public List<String> songs;

    public Playlist(){
        songs = new ArrayList<>();
    }

    public List<String> getSongs(){
        return songs;
    }

    public void addSong(String song){
        songs.add(song);
    }

    public void removeSong(String song){
        songs.remove(song);
    }

    public PlaylistIterator iterator(String type){
        switch(type){
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            case "favourite":
                return new FavouritesPlaylistIterator(this);
            default:
                return null;
        }
    }
}
