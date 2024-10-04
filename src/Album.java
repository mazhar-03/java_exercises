public class Album {
    private final String title;
    private final Song[] songs;
    public Album(String title, Song[] songs){
        this.title = title;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return title;
    }
    public Song[] getSongs() {
        return songs;
    }
}
