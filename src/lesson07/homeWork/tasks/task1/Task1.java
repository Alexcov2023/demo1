package lesson07.homeWork.tasks.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    Random random = new Random();

    public int [] createAndFeelArray (int numberOfSequence, int origin, int range) {
        int[] workArray = new int[numberOfSequence];
        for (int i = 0; i < workArray.length; i++) {
            workArray [i] = random.nextInt(origin, range);
        }
        return workArray;
    }

    public void average (int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        double average = ((double) sum / Array.length);
        System.out.println("Среднее арифметическое последовательности " + Arrays.toString(Array) + " равно " + average);

    }

    public int pow(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }
}
