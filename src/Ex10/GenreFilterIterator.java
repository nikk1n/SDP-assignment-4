package Ex10;
//Concrete Iterator
import java.util.List;

public class GenreFilterIterator implements SongIterator {
    private List<Song> songs;
    private String genre;
    private int position;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        while(position< songs.size()){
            Song song=songs.get(position);
            if (song.getGenre().equalsIgnoreCase(genre)){
                return true;
            } else{
                position++;
            }
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
