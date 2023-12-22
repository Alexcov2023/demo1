package lesson20;

abstract class Vehicle {

    private String vehicleName;
    private int speed;

    public Vehicle(String vehicleName, int speed) {
        this.vehicleName = vehicleName;
        this.speed = speed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract void speedUp();

    abstract void brake();
}
