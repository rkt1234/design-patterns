package builder;

public class Driver {
    public static void main(String[] args) {
        Dog d1=new Dog.DogBuilder().setName("null").setBreed("null").setGender("null").setPrice(0).build();
        Dog d2=new Dog.DogBuilder().setName("name").setBreed("breed").setGender("gender").setPrice(1000).build();
        System.out.println(d1);
        System.out.println(d2);

    }
}
