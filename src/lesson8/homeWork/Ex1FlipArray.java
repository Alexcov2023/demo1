package lesson8.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1FlipArray {
    /*
    Перевернуть массив:** Создайте метод, который принимает массив целых чисел и возвращает его в перевернутом порядке.
     Например, если входной массив `[1, 2, 3, 4]`, то результат должен быть `[4, 3, 2, 1]
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int arraySize = scanner.nextInt();

        HomeWork8Metods ex1 = new HomeWork8Metods ();

        int[] myArrayEx1 = new int [arraySize];
        ex1.feelArray(myArrayEx1, 50);
        System.out.println(Arrays.toString(myArrayEx1));
        System.out.println("=======================");

        int[] flipMyArrayEx1 = ex1.reverseArray(myArrayEx1);
        System.out.println(Arrays.toString(flipMyArrayEx1));

    }
}
