package lesson8.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4WithMetods {

/*
**Определение диапазона чисел в массиве:** Разработайте программу на Java, которая анализирует массив целых чисел
 и определяет разницу между наибольшим и наименьшим значениями.
 Например, для массива `[3, 7, 2, 9, 4]` программа должна сообщить, что
 разница между максимальным (9) и минимальным (2) значениями равна 7.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int arraySize = scanner.nextInt();

        HomeWork8Metods e4m = new HomeWork8Metods();

        int myArray [] = new int [arraySize];
        e4m.feelArray(myArray, 50);
        System.out.println(Arrays.toString(myArray));
        System.out.println("=======================");

        int max = e4m.maxValue(myArray);
        int min = e4m.minValue(myArray);

        System.out.println("Максимальное значение в массиве " +  e4m.maxValue(myArray));
        System.out.println(max);
        System.out.println("---------------------");

        System.out.println("Минимальное значение в массиве " + e4m.minValue(myArray));
        System.out.println(min);
        System.out.println("===========================");

        System.out.println("разница между максимальным (" + e4m.maxValue(myArray) + ") и минимальным (" + e4m.minValue(myArray) + ") значениями равна "
                + e4m.calcDifference(max, min));
        System.out.println("(" + max + ") минус " + "(" + min + ")" + " = " + (max - min));





    }

}
