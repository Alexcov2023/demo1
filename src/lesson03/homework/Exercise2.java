package lesson03.homework;

public class Exercise2 {
    public static void main(String[] args) {

        int x = 0;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;

        int y = (x + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9) / 10;

        System.out.println(y);
        System.out.println("Программа отбросила 5 в дробной части");

        double doubleResult = (double) (x + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9) / 10;

        System.out.println(doubleResult);
    }

}