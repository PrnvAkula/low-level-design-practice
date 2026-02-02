public class Main {
    public static void main(String[] args){
        Playlist playlist = new Playlist();
        playlist.addSong("song 1");
        playlist.addSong("song 2 Fav");
        playlist.addSong("song 3");
        playlist.addSong("song 4 Fav");
        playlist.addSong("song 5");

        System.out.println("\nSimple Playlist:");
        PlaylistIterator simpleIterator = playlist.iterator("simple");
        while(simpleIterator.hasNext()){
            System.out.println("Playing: " + simpleIterator.next());
        }

        System.out.println("\nShuffled Playlist:");
        PlaylistIterator shuffledIterator = playlist.iterator("shuffled");
        while(shuffledIterator.hasNext()){
            System.out.println("Playing: " + shuffledIterator.next());
        }

        System.out.println("\nFavourites Playlist:");
        PlaylistIterator favIterator = playlist.iterator("favourite");
        while(favIterator.hasNext()){
            System.out.println("Playing: " + favIterator.next());
        }
    }
}
