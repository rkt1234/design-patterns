package singleton;

public class Example {
    public static void main(String[] args) {
        System.out.println(Samosa.getSamosa().hashCode());
        System.out.println(Samosa.getSamosa().hashCode());
    }
}
