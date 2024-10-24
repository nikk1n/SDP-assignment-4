package Ex10;
//Concrete Iterator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements SongIterator{
    private List<Song> songs;
    private int position;
    public ShuffleIterator(List<Song> songs){
        this.songs=new ArrayList<>(songs);
        Collections.shuffle(this.songs);
        position=0;
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
