package lesson20;

public class Track extends Vehicle{
    public Track(String vehicleName, int speed) {
        super(vehicleName, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Track" + (getVehicleName()) + " speedUp!");
        setSpeed(getSpeed() + 30);
        System.out.println("Текущая скорость: " + getSpeed());

    }

    @Override
    void brake() {
        System.out.println("Scooter" + (getVehicleName()) + " brake!");
        setSpeed(getSpeed()  - 20);
        System.out.println("Текущая скорость: " + getSpeed());

    }
}

