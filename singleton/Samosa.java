package singleton;

public class Samosa {
    private static Samosa samosa;
    private Samosa() {
        System.out.println("Samosa created");
    }

    public static Samosa getSamosa() {
        synchronized(Samosa.class){
            if (samosa == null) {
            samosa = new Samosa();
            }
        }
            return samosa;
    }
}
