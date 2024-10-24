package Ex10;
//Individual songs class
public class Song {
    private String title;
    public String genre;

    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title+" Genre: "+genre;
    }
}
