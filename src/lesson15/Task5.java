package lesson15;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и
сообщите индекс его последнего вхождения в массив.
     */
    Random random = new Random();
    public static void main(String[] args) {
        int [] myArray = new int[12];
        int max = -15;
        int indexMax = 0;

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray [i] = random.nextInt(-15, 15);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("=======================");

        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray [i] ;
                indexMax = i;
            }

        }
        System.out.println(max);
        System.out.println(indexMax);










    }
}
