package lesson06.homeWork.ex4Lift;

import lesson06.homeWork.ex4Lift.Lift;

public class LiftDemo {
    /*
    Сломанный лифт
лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх.
 Найдите количество подьемов, которые понадобятся лифту.

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
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей в здании ");
        int floor = scanner.nextInt();

        System.out.println("Введите количество этажей при поднятии лифта ");
        int stepUp = scanner.nextInt();

        System.out.println("Введите количество этажей при спуске лифта ");
        int stepDown = scanner.nextInt();

 */
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;


        Lift lift = new Lift();

        lift.numberOfLifts (floor, stepUp, stepDown);

    }
}
