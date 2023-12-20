package lesson07.homeWork.ex1.lift;

public class Lift {

    public int numberOfLifts(int floor, int stepUp, int stepDown) {

        int numberOfAscents = floor/(stepUp-stepDown);
        numberOfAscents++;
        return numberOfAscents;
    }


}
