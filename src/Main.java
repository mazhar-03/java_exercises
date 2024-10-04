public class Main {
    public static void main(String[] args) {
        //ppj28
        Album alb1 = new Album("Loving You",
                new Song[]{
                        new Song("Elvis", "Party"),
                        new Song("Elvis", "Hot Dog")
                });
        Album alb2 = new Album("Ella & Louis",
                new Song[]{
                        new Song("Armstrong", "A Foggy Day"),
                        new Song("Fitzgerald", "Cheek to Cheek")
                });
        Album alb3 = new Album("The Best Of",
                new Song[]{
                        new Song("Elvis", "I Love You Because"),
                        new Song("Sinatra", "My Way")
                });

        Shelf shelf = new Shelf(new Album[]{alb1, alb2, alb3});
        System.out.println("Song from album: " + shelf.findAlbumBySong("Cheek to Cheek"));

        Song[] elvisSongs = shelf.findSongsBySinger("Elvis");

        Song[] armstrongSongs = shelf.findSongsBySinger("Armstrong");

        for (int i = 0; i < elvisSongs.length; i++)
            System.out.println(elvisSongs[i]);

        for (int i = 0; i < armstrongSongs.length; i++)
            System.out.println(armstrongSongs[i]);

        //ppj25
        //1
        try {
            MyClass.myMethod();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            MyClass.myMethod2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SmokeDetector.check();
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }
        //2

        //3
        try {
            Rocket r = new Rocket("RADI", 400);
            r.refuel();
            r.refuel();
            r.refuel();
            r.refuel();
            r.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
