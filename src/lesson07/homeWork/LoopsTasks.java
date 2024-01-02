package lesson07.homeWork;

import java.util.Scanner;

public class LoopsTasks {
    /* Задача 1
    **Цель**: Используя цикл for/while, написать программу, выводящую кубы чисел от 1 до n.
- **Пример**: Для числа n = 3, результат должен быть:
    - 1 в кубе = 1
    - 2 в кубе = 8
    - 3 в кубе = 27
     */
    public void raising3rdPower(int n) {
        for (int i = 1; i <= n; i++) {
            int result = i * i * i;
            System.out.println(result);
        }
    }

    /*
    Задача 2
- **Цель**: С помощью цикла for/while написать программу, выводящую результат умножения числа n на все целые числа от 0 до n.
- **Пример**: Для числа 3, результат будет 0, 3, 6, 9.
     */
    public void multiplResult(int n){
        for (int i = 0; i <= n; i++) {
           System.out.println("Результат умножения числа " + n + " на число " + i + " равен " + n*i);
        }
    }

    /*
    #### Task 0
- **Цель**: Распечатать 10 строк: "Task1", "Task2", ..., "Task10". Использовать цикл for/while.
     */
    public void printTasks() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i);
            i++;
        }
    }

    /*
    Task 1
- **Цель**: Распечатать все числа от 1 до 100, делящиеся на 5 без остатка. Использовать цикл do-while.
     */
    public void printNumers(){
        int x = 1;
        do {
            if (x % 5 == 0) {
                System.out.println(x);
            }
            x++;
        } while (x <= 100);
    }

    /*
    Task 2
- **Цель**: Распечатать только первые 7 чисел от 1 до 100, делящиеся на 5 без остатка. Использовать цикл while.
     */
    public void printFirst7Numbers(){
        int i = 1;
        int counter = 0;
        while (i <= 100 && counter < 7){
            if (i % 5 == 0) {
                counter++;
                System.out.println("Число номер " + counter + " равно " + i);
            }
            i++;
        }
    }

    // Task 2 ---- с помощью массива
    public int[] printFirstSevenNumbers(){
        int [] workArray = new int[7];
        int i = 1;
        int counter = 0;
        while (i <= 100 && counter < 7){
            if (i % 5 == 0) {
                workArray[counter] = i;
                counter++;
            }
            i++;
        }
        return workArray;
    }

    /*
    Task 3
- **Цель**: Программа запрашивает у пользователя слово "hello". Если слово введено верно, программа благодарит и завершает работу.
В противном случае запрашивает ввести слово снова.
- **Опционально**: Считать количество попыток, требуемых для введения правильного слова. По окончанию вывести это число.
     */
    public void checkWord(){
        String word = "";
        int counter = 0;

        while (!word.equals("hello")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово 'hello'");
            word = scanner.nextLine();
            counter++;
        }
        System.out.println("Поздравляем, вы справились с " + counter + " попытки");

    }

    /*
Task 4
- **Цель**: Программа просит пользователя ввести произвольное число и выводит сумму его цифр.
- **Пример**: Для числа 567432 результат будет 5+6+7+4+3+2 = 27.
     */

    public int sumDigitsOfNumber(int number){
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }


}
