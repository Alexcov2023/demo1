package lesson15.task3;

import java.util.Scanner;

public class Task3 {
    /*
    Напишите программу, которая определит, сколько слов Вы ввели с консоли.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш набор слов");

 /*     String inputString = scanner.nextLine();
        int count = 0;

        if (inputString.length() != 0) {
            count++;
            for (int i= 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == ' ') {
                    count++;
                }
                System.out.println(i);
            }
        }
        System.out.println("Вы ввели " + count + " слов");
 */

        // С помощью отдельного метода
        Task3Counter counter = new Task3Counter();
        counter.counterWord(scanner.nextLine());

    }
}
