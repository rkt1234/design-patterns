package factory;
// This is the client class and using the factory pattern we want to remove the resoinbiity of creating object from the client class
// A factiry class is such a class which has such methods which can return objects of some other class based on certain user requiremnts
public class DeveloperClient {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("Android");
        System.out.println(emp.salary());
    }
}
