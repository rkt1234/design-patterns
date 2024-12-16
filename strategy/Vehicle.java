package strategy;

class Vehicle {
    DriveStrategy driveobject;
    public Vehicle(DriveStrategy driveobject) {
        this.driveobject = driveobject;
    }
    public void drive() {
        driveobject.drive();
    }
}