package lesson13.homeWork.setOfTools1;

import lesson13.homeWork.setOfTools1.SetTools;

import java.util.Arrays;
import java.util.Scanner;

public class SetToolsDemo {
    public static void main(String[] args) {
        SetTools[] set = new SetTools[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название 1-го инструмента в  1-м наборе ");

        Scanner scanner1 = new Scanner(System.in);
        if (scanner.hasNext()) {
        System.out.println("Введите название 2-го инструмента в  1-м наборе ");
        }

        set [0] = new SetTools(scanner.nextLine(), scanner1.nextLine());
        System.out.println("Набор 1 " + set[0]);
        System.out.println("-------------------------------");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите название 1-го инструмента в  2-м наборе ");

        Scanner scanner3= new Scanner(System.in);
        if (scanner2.hasNext()) {
            System.out.println("Введите название 2-го инструмента в  2-м наборе ");
        }

        set [1] = new SetTools(scanner2.nextLine(), scanner3.nextLine());
        System.out.println("Набор 2  " + set[1]);

        System.out.println("====================================================");

        for (int i = 0; i < set.length; i++) {
            System.out.println("Набор " + (i + 1) + " " + set [i]);
        }

    }
}
