package lesson8.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    /*
    Проверка на уникальность элементов:** Напишите функцию, которая проверяет, все ли элементы в массиве уникальны.
     Функция должна возвращать `true`, если все элементы уникальны, и `false`, если найдены дубликаты.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int arraySize = scanner.nextInt();

        HomeWork8Metods ex2 = new HomeWork8Metods ();

        int[] myArrayEx2 = new int [arraySize];
        ex2.feelArray(myArrayEx2, 100);
        System.out.println(Arrays.toString(myArrayEx2));
        System.out.println("=======================");

        boolean x = ex2.checkElementsUnique(myArrayEx2);
        System.out.println(x);

    }
}
