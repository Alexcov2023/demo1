package lesson08.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
/*
ычисление среднего значения элементов массива: Напишите метод на Java,
который принимает массив целых чисел и возвращает их среднее значение.
Если массив пуст, метод должен возвращать 0. Например, для массива [1, 2, 3, 4, 5] среднее значение будет 3.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array size: ");
        int arraySize = scanner.nextInt();
        int[] demoArray = new int[arraySize];

        for (int i = 0; i < demoArray.length; i++) {
            demoArray[i] = random.nextInt(20);
                    }
        System.out.println(Arrays.toString(demoArray));

        int sum = 0;
         if (arraySize > 0) {
            for (int i = 0; i < demoArray.length; i++) {
                sum = sum + demoArray[i];
            }
               System.out.println("Cреднее значение чисел в массиве = " + (sum / arraySize));
        } else {
            System.out.println("0");

        }


    }

}

