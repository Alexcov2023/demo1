package lesson06.homeWork.ex2;

import java.util.Scanner;

public class FlaksDemo {
    /*
    Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Внесите значения температуры для первой колбы:");
        int temperature1 = scanner.nextInt();

        System.out.println("Внесите значения температуры для второй колбы:");
        int temperature2 = scanner.nextInt();

        Flaks flaks = new Flaks();

        System.out.println("Прибор работает корректно это " + flaks.corectWorkOfDevice(temperature1,temperature2));


    }
}

