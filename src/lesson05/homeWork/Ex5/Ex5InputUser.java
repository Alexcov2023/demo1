package lesson05.homeWork.Ex5;

import java.util.Scanner;

public class Ex5InputUser {
    Scanner scanner = new Scanner(System.in);

    public double enter1Number() {
        System.out.println("Введите первое число ");
        double x = scanner.nextDouble();
        return x;
    }

    public double enter2Number() {
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        return y;
    }

}
