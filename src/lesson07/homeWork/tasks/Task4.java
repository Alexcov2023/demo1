package lesson07.homeWork.tasks;

import java.util.Random;
/*
- **Цель**: Определить, является ли год високосным.
- **Условия**: Год является високосным, если он делится на 4 без остатка, и либо не делится на 100, либо делится на 400.
 */
public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(1, 2023);

        boolean isALeapYear;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            //System.out.println("Год " + year + " является високосным");
            isALeapYear = true;
        //} else {System.out.println("Год " + year + " НЕ является високосным");
        } else {isALeapYear = false;
        }

        System.out.println("Год " + year + " является високосным - это " + isALeapYear);

    }
}
