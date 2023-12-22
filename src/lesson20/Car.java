package lesson20;

public class Car extends Vehicle {
    public Car(String vehicleName, int speed) {
        super(vehicleName, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Car" + (getVehicleName()) + " speedUp!");
        setSpeed(getSpeed() + 60);
        System.out.println("Текущая скорость: " + getSpeed());

    }

    @Override
    void brake() {
        System.out.println("Carr" + (getVehicleName()) + " brake!");
        setSpeed(getSpeed()  - 50);
        System.out.println("Текущая скорость: " + getSpeed());
    }
}
