package lesson07.homeWork.tasks.task1;

import java.util.Scanner;

public class Task1Demo {
    /*
     **Цель**: Получить n-ую степень числа и среднее арифметическое последовательности из n чисел.
     */
    public static void main(String[] args) {


        Task1 task1 = new Task1();
        task1.average(task1.createAndFeelArray(6, 1, 10));
        System.out.println("========================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int number = scanner.nextInt();
        System.out.println("Введите степень, в которую нужно возвести число");
        int degree = scanner.nextInt();

        int result = task1.pow(number, degree);
        System.out.println("Результат возведения числа " + number + " в степень " + degree + " является число " + result);











    }
}
