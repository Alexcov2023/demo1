package lesson07.homeWork.ex1.liftOther;

public class LiftOther {

    public int numberOfLifts(int floor, int stepUp, int stepDown) {

        int liftCounter = 0;
        int tempLifts = 0;
        while (tempLifts < floor) {
            tempLifts = tempLifts + stepUp - stepDown;
            liftCounter++;
        }
        return liftCounter;

    }
}
