package lesson6.homeWork;

import java.util.Scanner;

public class CanBuyMethod {
        Scanner scanner = new Scanner(System.in);
    public boolean inputisEdekaOpen(){
        boolean input = Boolean.parseBoolean(scanner.nextLine());
        return input;
    }

    public boolean inputisReweOpen(){
        boolean input = Boolean.parseBoolean(scanner.nextLine());
        return input;
    }
}