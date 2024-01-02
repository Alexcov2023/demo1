package lesson07.homeWork.tasks;

import java.util.Random;

public class Task2 {
    /*
    **Цель**: Определить четверть координатной плоскости для точки с координатами (x, y).
- **Условия**: x и y - случайные целые числа в интервале от -10 до 10.
     */
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(-10, 10);

        int y = random.nextInt(-10, 10);

        if (x > 0 && y > 0) {
            System.out.println("Точка с координатами ( " + x + ", " + y + ") находится в  *первой*  четверти координатной плоскости");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка с координатами ( " + x + ", " + y + ") находится во  *второй*  четверти координатной плоскости");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка с координатами ( " + x + ", " + y + ") находится в  *третьей*  четверти координатной плоскости");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка с координатами ( " + x + ", " + y + ") находится в  *четвертой*  четверти координатной плоскости");
        } else {
            System.out.println("Точка с координатами ( " + x + ", " + y + ") лежит в начале координат, что является неконкретным положением");
        }

    }
}