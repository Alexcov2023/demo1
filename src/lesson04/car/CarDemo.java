package lesson04.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2.5, "black", true );

        System.out.println(car1.model);
        car1.beep();
        car1.start();

        Car car2 = new Car("Honda", 3.0, "silver", false);


    }
}

