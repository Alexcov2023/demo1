package lesson07.homeWork.tasks;

import java.util.Random;

public class Task3 {
    /*
    - **Цель**: Склонение слова "корова" в зависимости от числа n.
- **Входные данные**: Целое положительное число n (n ≤ 10).
- **Выходные данные**: Фраза "На лугу пасется n коров(а/ы)".
     */
    public static void main(String[] args) {

        Random random = new Random();

        int n = random.nextInt(8, 10);

        if (n == 1) {
            System.out.println("На лугу пасется " + n + " корова");
        }
        if (n >= 2 && n <= 4) {
            System.out.println("На лугу пасутся " + n + " коровы");
        }

        if (n >= 5 && n <= 10) {
            System.out.println("На лугу пасутся " + n + " коров");
        }


    }
}
