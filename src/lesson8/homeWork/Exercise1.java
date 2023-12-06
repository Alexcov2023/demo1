package lesson8.homeWork;

/*
1. Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

**
если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      System.out.println("Please enter your array size: ");
      int arraySize = scanner.nextInt();

      int[] intArray = new int[arraySize];

      for (int i = 0; i < intArray.length; i++) {
        intArray[i] = random.nextInt(20);
            }

      System.out.println(Arrays.toString(intArray));

      //-----------------------------------------------

      int max = intArray[0];
      int indexMax = 0;
      for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] > max) {
          max = intArray[i];
          indexMax = i;
        }
      }

      System.out.println("Max from array = " + max + " and index = " + indexMax);

      //---------------------------------------------------

      int sum = 0;
      for (int i = 0; i < intArray.length; i++) {
        sum = sum + intArray[i];
              }

      System.out.println("Cуммa всех элементов массива = " + sum);

      // -----------------------------------------------------

      int conter = 0;
      for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] == max) {
          conter++;
        }
      }

      int contIndex = 0;
      int[] indexArray = new int[conter];
      for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] == max) {
          indexArray[contIndex] = i;
          contIndex++;
        }
      }
      System.out.println("Массив из индексов, если макс. значение в основном массиве повторяется = " + Arrays.toString(indexArray));

    }
}
