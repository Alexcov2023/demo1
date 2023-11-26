package lesson8.ExampleArrayLMS;

public class ExempleArrayLMS1 {

    public static void main(String[] args) {

        // Объявление и инициализация массива
        int [] myArray = new int[5];

        // Инициализация элементов массива
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
        }

        // Вывод элементов массива
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Элемент индекса " + i + ": " + myArray[i]);
        }

    }
}

