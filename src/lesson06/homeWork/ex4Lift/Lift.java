package lesson06.homeWork.ex4Lift;

public class Lift {

    public void numberOfLifts(int floor, int stepUp, int stepDown) {
        int H = 0;
        int numberOfLifts = 0;
        while (H <= floor) {
            H = H + stepUp - stepDown;
            numberOfLifts++;
            System.out.println("Подъем " + numberOfLifts + " количество этажей " + H);
        }
        System.out.println(" Количество подъемов лифта " + numberOfLifts);
    }
}
