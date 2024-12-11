package factory;
// This is the factory class which would create objects based on user input and as and when required
public class EmployeeFactory {

    public static Employee getEmployee(String emp) {
        if(emp == "Android")
        return new AndroidDeveloper();
        else
        return new WebDeveloper();

    }
}
