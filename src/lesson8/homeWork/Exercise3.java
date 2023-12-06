package lesson8.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
/*
 Поиск часто встречающегося элемента:** Создайте метод, который находит элемент,
 который встречается чаще всего в массиве целых чисел.
 Если таких элементов несколько, метод может вернуть любой из них.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int arraySize = scanner.nextInt();

        HomeWork8Metods hw3 = new HomeWork8Metods();

        int [] myArrayEx3 = new int[arraySize];
        hw3.feelArray(myArrayEx3, 20);
        System.out.println(Arrays.toString(myArrayEx3));
        System.out.println("===========================");


        System.out.println(hw3.frequentArrayElement(myArrayEx3));


    }

}
