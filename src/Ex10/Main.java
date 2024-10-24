package Ex10;
//Usage
public class Main {
    public static void main(String[] args) {
        Playlist playlist=new Playlist();
        playlist.addSong(new Song("Song 1","Pop"));
        playlist.addSong(new Song("Song 2","Rock"));
        playlist.addSong(new Song("Song 3","Rap"));
        playlist.addSong(new Song("Song 4","Swing"));
        playlist.addSong(new Song("Song 5","Pop"));
        playlist.addSong(new Song("Song 6","Pop"));
        System.out.println("Playing songs in sequential order:");
        SongIterator sequentialIterator= playlist.getSequentialIterator();
        while(sequentialIterator.hasNext()){
            System.out.println("Playing "+sequentialIterator.next());
        }
        System.out.println("\nPlaying songs in random order:");
        SongIterator shuffleIterator= playlist.getShuffleIterator();
        while(shuffleIterator.hasNext()){
            System.out.println("Playing "+shuffleIterator.next());
        }
        System.out.println("\nPlaying songs with 'pop' genre: ");
        SongIterator genreFilterIterator= playlist.getGenreFilterIterator("pop");
        while (genreFilterIterator.hasNext()){
            System.out.println("Playing "+genreFilterIterator.next());
        }

    }
}
