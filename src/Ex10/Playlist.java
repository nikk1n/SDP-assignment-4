package Ex10;

import java.util.ArrayList;
import java.util.List;
//Stores songs and makes iterators
public class Playlist {
    private List<Song> songs=new ArrayList<>();
    public void addSong(Song song){
        songs.add(song);
    }
    public SongIterator getSequentialIterator(){
        return new SequentialIterator(songs);
    }
    public  SongIterator getShuffleIterator(){
        return new ShuffleIterator(songs);
    }
    public SongIterator getGenreFilterIterator(String genre){
        return new GenreFilterIterator(songs,genre);
    }
}
