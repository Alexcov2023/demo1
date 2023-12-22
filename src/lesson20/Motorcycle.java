package lesson20;

public class Motorcycle extends Vehicle{
    public Motorcycle(String vehicleName, int speed) {
        super(vehicleName, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Motorcycle" + (getVehicleName()) + " speedUp!");
        setSpeed(getSpeed() + 80);
        System.out.println("Текущая скорость: " + getSpeed());

    }

    @Override
    void brake() {

    }
}
