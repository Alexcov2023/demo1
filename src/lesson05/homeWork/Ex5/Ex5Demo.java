package lesson05.homeWork.Ex5;

public class Ex5Demo {

    public static void main(String[] args) {

        Ex5ArithmeticOperation ex5ArithmeticOperation = new Ex5ArithmeticOperation();
        Ex5InputUser inputUser = new Ex5InputUser();

        double x = inputUser.enter1Number();
        double y = inputUser.enter2Number();

        //сложение
        ex5ArithmeticOperation.additionResult(x, y);

        //вычитание (пример, когда метод возвращает результат)
        System.out.println("Результат вычитания чисел " + x +" и " + y + " равен " + ex5ArithmeticOperation.substractResult(x, y));

        //умножение
        ex5ArithmeticOperation.multiplResult(x, y);

        //деление
        ex5ArithmeticOperation.divisionResult(x, y);


     }
}
