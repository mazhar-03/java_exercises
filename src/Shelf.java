public class Shelf {
    private final Album[] albums;

    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public Album findAlbumBySong(String songName) {
        for (Album album : albums)
            for (Song song : album.getSongs())
                if (song.getTitle().equals(songName))
                    return album;
        return null;
    }
    public Song[] findSongsBySinger(String singer){
        int counter = 0;
        for(Album album : albums)
            for(Song s : album.getSongs())
                if(s.getSinger().equals(singer))
                    counter++;

        Song[] songs = new Song[counter];
        int  index = 0;

        for(Album album : albums)
            for(Song s : album.getSongs())
                if(s.getSinger().equals(singer))
                    songs[index++] = s;

        return songs;
    }
}
