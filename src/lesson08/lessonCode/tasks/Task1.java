package lesson08.lessonCode.tasks;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

**
если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами
 */

public class Task1 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter array size ");
      int arraySize = scanner.nextInt();

      ArrayOperations ao = new ArrayOperations();

      int[] intArray = new int[arraySize];

      ao.fillArrayByRandom(intArray, 20);

      System.out.println(Arrays.toString(intArray));

      ArrayResult maxFromArray = ao.maxOfArrayElement(intArray);

      System.out.println("Max from array = " + maxFromArray.getMaxElement() + " index = " + maxFromArray.getIndexOfMaxElement() );

      int sumOfArrayElements = ao.sumOfArrayElements(intArray);

      System.out.println("Sum of array elements = " + sumOfArrayElements );

      System.out.println("Array indexes: " + Arrays.toString(ao.arrayIndexForMaxElements(intArray)));

    }
}
