package lesson20;

public class Bicycle extends Vehicle {
    public Bicycle(String vehicleName, int speed) {
        super(vehicleName, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Bicycle" + (getVehicleName()) + " speedUp!");
        setSpeed(getSpeed() + 10);
        System.out.println("Текущая скорость: " + getSpeed());
    }

    @Override
    void brake() {

    }
}
