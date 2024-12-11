package builder;

public class Dog {
    private String name;
    private String gender;
    private String breed;
    private double price;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    public static class DogBuilder {
    private String name;
    private String gender;
    private String breed;
    private double price;

    public String getName() {
        return name;
    }

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DogBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public DogBuilder setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    public Dog build() {
        return new Dog(this);
    }
    }

    public Dog(DogBuilder dogbuilder) {
        this.name=dogbuilder.getName();
        this.gender=dogbuilder.getGender();
        this.breed=dogbuilder.getBreed();
        this.price=dogbuilder.getPrice();
    }

    

}
