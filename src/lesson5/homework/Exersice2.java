package lesson5.homeWork;

import java.util.Scanner;

public class Exersice2 {
    /*
    2. Задание №2
Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
Распечатать на консоль.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first word.");
        String firstWord = scanner.nextLine();
        System.out.println("Your first word is " + firstWord);

        System.out.println("Enter your second word.");
        String secondWord = scanner.nextLine();
        System.out.println("Your first word is " + secondWord);


        String resultWord = firstWord.substring(0, firstWord.length() / 2) + secondWord.substring(secondWord.length() / 2 + 1, secondWord.length());
        System.out.println("a word consisting of the first half of the first word and the second half of the second word is " +  resultWord);

    }

}
