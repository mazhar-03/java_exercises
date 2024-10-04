public class Song {
    private final String singer;
    private final String title;
    public Song(String singer, String title){
        this.singer = singer;
        this.title = title;
    }

    @Override
    public String toString() {
        return singer + " - " + title;
    }
    public String getSinger() {
        return singer;
    }
    public String getTitle() {
        return title;
    }
}
