package lesson07.homeWork.exercises;

import java.util.Scanner;

public class Ex2 {
    /*
    Подсчитать сумму всех четных чисел от 0 до N
при том что N вводится пользователем
     */
    public static void main(String[] args) {

    int sum = 0;
    int n;
    Scanner scanner = new Scanner(System.in);

        System.out.println("введите любое положительное число ");
        n = scanner.nextInt();

        for (int i =0;  i <= n; i++)
    {       if (i % 2 == 0) {
            sum = sum + i;    }
    }
        System.out.println("Sum of number " + sum);
    }
}
