import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylistIterator implements PlaylistIterator{
    private int index;
    private ArrayList<String> shuffledSongs;

    public ShuffledPlaylistIterator(Playlist playlist){
        this.index = 0;
        this.shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext(){
        return index < shuffledSongs.size();
    }

    @Override
    public String next(){
        return shuffledSongs.get(index++);
    }
}
