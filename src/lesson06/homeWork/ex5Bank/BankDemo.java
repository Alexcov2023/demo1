package lesson06.homeWork.ex5Bank;

import java.util.Scanner;

public class BankDemo {

    /*
    Снять деньги
У вас на банковском счету N долларов. ВЫ хотите снять все, но банк разрешает снять только сумму,
которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

Пример
Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму остатка на расчетном счету");
        int accountBalance = scanner.nextInt();
        int workAccountBalance = accountBalance;
        int dayCounter = 0;

        Bank bank = new Bank();

           while (workAccountBalance > 0) {
            int maxWithdrawAmount = bank.maxDeductAmount(workAccountBalance);
            workAccountBalance = workAccountBalance - maxWithdrawAmount;
            dayCounter++;
            System.out.println("День " + dayCounter + " максим. возможная для снятия сумма " + maxWithdrawAmount + " остаток на счету " + workAccountBalance);
        }

        System.out.println("=================================");
        System.out.println("Для снятия с расчетного суммы в " + accountBalance + " понадобилось " + dayCounter + " дней");





    }
}


