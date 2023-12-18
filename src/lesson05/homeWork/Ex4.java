package lesson05.homeWork;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Ex4 {

    /*
    Тема: создание переменной типа String.
   Напишите программу в которой создайте переменную
   типа String и присвойте ей в качестве начального значения
   ваше имя. Выведете на консоль значение этой переменной.

   Тема: Конкатенация строк.
   Напишите программу в которой создайте переменную
   типа String и присвойте ей в качестве начального значения
   ваше имя. Выведете на консоль приветствие типа "Hi YourName".

   Тема: Считывание строк с консоли.
   Программа должна спрашивать как зовут пользователя,
   считывать его имя с консоли и выводить приветствие
   в виде: "Hello UserName!".
     */
    public static void main(String[] args) {

        String name = "ALexandr";
        System.out.println("My name is " + name);

        String message = "I am " + "18 years old.";
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username ?");
        String username = scanner.nextLine();
        System.out.println("Hello Username " + username + "!");

    }

}
