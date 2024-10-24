package Ex10;
//Concrete Iterator
import java.util.List;

public class SequentialIterator implements SongIterator{
    private List<Song> songs;
    private int position;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position<songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
