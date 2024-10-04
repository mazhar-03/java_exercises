import java.util.Arrays;

public class Album {
    private String title;
    private Song[] songs;
    public Album(String title, Song[] songs){
        this.title = title;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }
    public Song[] getSongs() {
        return songs;
    }
}
