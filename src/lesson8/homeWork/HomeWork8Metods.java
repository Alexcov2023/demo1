package lesson8.homeWork;

import java.util.Random;

public class HomeWork8Metods {

    public int [] feelArray (int[] workArray, int range) {
        Random random = new Random();
        for (int i = 0; i < workArray.length; i++) {
            workArray [i] = random.nextInt(range);
        }
        return workArray;
    }

    public int maxValue (int[] workArray) {
        int max = workArray[0];
        for (int i = 1; i < workArray.length; i++) {
         if (max < workArray[i]) {
             max = workArray[i];
         }
        }
        return max;
    }

    public int minValue (int[] workArray) {
        int min = workArray[0];
        for (int i = 1; i < workArray.length; i++) {
            if (min > workArray[i]) {
                min = workArray[i];
            }
        }
        return min;
    }

    public int calcDifference (int max, int min) {
        return max - min;
    }

    public int[] reverseArray(int[] workingArray){
        int[] reverseArray = new int[workingArray.length];
        for (int i = 0; i < reverseArray.length; i++) {
            int j = reverseArray.length - 1 - i;
            reverseArray[i] = workingArray[j];
            /*
            {1 , 2, 3, 4}
            {4,            }
             */
        }
        return reverseArray;
    }

    public boolean checkElementsUnique(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = i + 1; j < workingArray.length; j++) {
                if (workingArray[i] == workingArray[j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public int frequentArrayElement (int [] workingArray) {

        /*
            способ это вернуть первый элемент, удовлетворяющий условиям задачи его реализация ниже
         */

        int element = 0;
        int maxFrequent = 0;

        for (int i = 0; i < workingArray.length; i++) {
            int frequent = 0;
            for (int j = 0; j < workingArray.length; j++) {
                if (workingArray[i] == workingArray[j]) {
                    frequent++;
                }
                if (frequent > maxFrequent) {
                    maxFrequent = frequent;
                    element = workingArray[i];
                }
            }

        }
        System.out.println("Количество повторений: " + maxFrequent);
        System.out.println("Чаще всего встречающегося элемента: ");
        return element;
    }

}