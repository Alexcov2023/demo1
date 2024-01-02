package lesson07.homeWork.exercises.Ex1LiftOther;

public class LiftOtherDemo {
    public static void main(String[] args) {

        LiftOther liftOther = new LiftOther();

        int numberOfAscents = liftOther.numberOfLifts(200, 50, 1);
        System.out.println("Количество подъемов лифта, чтобы достичь верхнего этажа " + numberOfAscents);

        int numberOfAscents1 = liftOther.numberOfLifts(300, 50, 5);
        System.out.println("Количество подъемов лифта во втором здании, чтобы достичь верхнего этажа " + numberOfAscents1);

    }
}
