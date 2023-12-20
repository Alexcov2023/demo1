package lesson07.homeWork.ex1.lift;

import lesson07.homeWork.ex1.lift.Lift;

import java.util.Scanner;

public class LiftDemo {

    /*    Сломанный лифт
лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей,
то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.

Пример:
Ввод:
H = 200, N = 50, M = 1
Ответ: 5
Объяснение:
Первый подьем: 50 - 1 = 49
Второй подьем: 49 + 50 - 1 = 98
Третий подьем: 98 + 50 - 1 = 147
Четвертый подьем: 147 + 50 - 1 = 196
Пятый подьем: выйти за пределы H.
реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей здания");
        int floor = scanner.nextInt();

        System.out.println("Введите количество этажей при подьеме лифта");
        int stepUp = scanner.nextInt();

        System.out.println("Введите количество этажей при спуске лифта");
        int stepDown = scanner.nextInt();

        Lift lift = new Lift();

        int numberOfAscents = lift.numberOfLifts(floor,stepUp,stepDown);

        System.out.println("Количество подьемов, который понадобятся лифту для достижения верхнего этажа " + numberOfAscents);

    }
}
