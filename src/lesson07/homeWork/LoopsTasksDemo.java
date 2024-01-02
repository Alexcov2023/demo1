package lesson07.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsTasksDemo {

    public static void main(String[] args) {

        LoopsTasks loopsTasks = new LoopsTasks();

        Scanner scanner = new Scanner(System.in);

        //Задача1
        loopsTasks.raising3rdPower(3);
        System.out.println("==========================");

        //Задача2
        loopsTasks.multiplResult(4);
        System.out.println("==========================");

        //Task0
        loopsTasks.printTasks();
        System.out.println("==========================");

        //Task1
        loopsTasks.printNumers();
        System.out.println("==========================");

        //Task2
        loopsTasks.printFirst7Numbers();
        System.out.println("==========================");

        //Task2 с помощью массива
        System.out.println(Arrays.toString(loopsTasks.printFirstSevenNumbers()));
        System.out.println("==========================");

        //Task3
        loopsTasks.checkWord();
        System.out.println("==========================");

          //Task4
        System.out.println("Введите любое целое число");
        int number = scanner.nextInt();
        System.out.println("Cумма цифр введенного числа равна " + loopsTasks.sumDigitsOfNumber(number));

    }
}
