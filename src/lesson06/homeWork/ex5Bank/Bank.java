package lesson06.homeWork.ex5Bank;

public class Bank {

    public int maxDeductAmount(int balance){
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
