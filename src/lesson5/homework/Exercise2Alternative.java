package lesson5.homeWork;


import java.util.Scanner;

public class Exercise2Alternative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("(Please enter first word:");
        String word1 = scanner.nextLine();
        System.out.println("Please enter second word:");
        String word2 = scanner.nextLine();;

        int word1length = word1.length() / 2;
        String firstPart = word1.substring(0, word1length);

        int word2length = word2.length() / 2 + word2.length() % 2;
        String secondPart = word2.substring(word2length);
        System.out.println(word2length);

        String finalWord = firstPart + secondPart;

        System.out.println(finalWord);


    }
}
