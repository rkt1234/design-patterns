package factory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        // TODO Auto-generated method stub
        System.out.println("Getting web salary");
        return 60000;
    }
    
}
