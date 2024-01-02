package lesson07.homeWork.exercises;

import java.util.Scanner;

public class Ex4 {
 /*
 ользователь ввел число N. Подсчитайте количество четных
 и не четных чисел в диапазоне от 0 до N
  */
    public static void main(String[] args) {

        int n;
        int numberEvenNumbers = 0;
        int numbersOddNumbers = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое положительное число ");
        n = scanner.nextInt();

        for (int i = 1;  i <= n; i++)
        {       if (i % 2 == 0) {
            numberEvenNumbers = numberEvenNumbers + 1;
        }

            if (i % 2 != 0) {
                numbersOddNumbers = numbersOddNumbers + 1;
            }
        }
        System.out.println("Количество четных чисел в диапазон от 0 до " + n + " составляет " + numberEvenNumbers);

        System.out.println("=======================================");

        System.out.println("Количество нечетных чисел в диапазон от 0 до " + n + " составляет " + numbersOddNumbers);


    }
}
