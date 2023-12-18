package lesson05.homeWork.Ex3;

public class Ex3ExtraCalories {
     /*
Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
         */
    public static void main(String[] args) {

        double calorienIn1cm2OfPizza = 40;
        double diametr1 = 24;
        double diametr2 = 28;

        Ex3CaloriesInPizza caloriesInPizza = new Ex3CaloriesInPizza();


        double extraCalories = caloriesInPizza.caloriesInPizza(diametr2, calorienIn1cm2OfPizza) - caloriesInPizza.caloriesInPizza(diametr1, calorienIn1cm2OfPizza);
        System.out.println("Пицца диаметром 28см содержит по сравнению с пиццей диаметром 24см содержит больше на " + extraCalories + " калорий");






    }
}
