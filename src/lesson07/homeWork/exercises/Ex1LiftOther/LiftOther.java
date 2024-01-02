package lesson07.homeWork.exercises.Ex1LiftOther;

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
