public class SmokeDetector {
    public static void check() throws Alarm{
        if(Math.random() < 0.3)
            throw new Alarm();
    }
}
