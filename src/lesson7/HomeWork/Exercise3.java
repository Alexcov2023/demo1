package lesson7.HomeWork;

import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {

            /*
        Используйте цикл, чтобы просуммировать все числа,
        которые ввел пользователь, до первого отрицательного.
         */

        int x;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.println("Please enter integer number");
            x = scanner.nextInt();

            if (x > 0) {
                sum = sum + x;
            } else {
                System.out.println("Sum of number " + sum);
            }

            }


        }

    }