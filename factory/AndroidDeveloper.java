package factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting andorid salary");
        return 50000;
    }
    
}