package lesson20;

public class Scooter extends Vehicle{
    public Scooter(String vehicleName, int speed) {
        super(vehicleName, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Scooter" + (getVehicleName()) + " speedUp!");
        setSpeed(getSpeed() + 5);
        System.out.println("Текущая скорость: " + getSpeed());

    }

    @Override
    void brake() {
        System.out.println("Scooter" + (getVehicleName()) + " brake!");
        setSpeed(getSpeed()  - 5);
        System.out.println("Текущая скорость: " + getSpeed());
    }

}
