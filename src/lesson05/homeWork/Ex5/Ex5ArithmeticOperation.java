package lesson05.homeWork.Ex5;

public class Ex5ArithmeticOperation {
    /*
    Реализовать программу, выводящую на экран результаты сложения,
вычитания, умножения и деления двух чисел, введенных пользователем.
Каждая из арифметических операций должна быть реализована как отдельный метод.
Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.
     */

    // метод, который ничего не возвращает. Все происходит в самом методе
    public void additionResult(double x, double y) {
        System.out.println("Результат сложения чисел " + x +" и " + y + " равен " + (x+y));
    }

    //метод, который возвращает результат
    public double substractResult(double x, double y) {
        return x - y;
    }

    public void multiplResult(double x, double y) {
        System.out.println("Результат умножения чисел " + x +" и " + y + " равен " + (x*y));
    }

    public void divisionResult(double x, double y) {
        System.out.println("Результат деления чисел " + x +" и " + y + " равен " + (x/y));
    }

}
