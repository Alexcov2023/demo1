package lesson15;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    /*
6. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
   Выведите массив на экран в строку.
   Замените каждый элемент с нечётным индексом на ноль
   Снова выведете массив на экран на отдельной строке
     */
    public static void main(String[] args) {
        Random random = new Random();
         int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[0] +""+ array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7]);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println("---------------------------");
        System.out.println(array[0] +""+ array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7]);


    }
}
