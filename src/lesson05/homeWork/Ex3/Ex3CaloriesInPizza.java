package lesson05.homeWork.Ex3;

public class Ex3CaloriesInPizza {

    public double caloriesInPizza(double diameter, double caloriesInOneCm){
        double squarePizza = Math.PI * (diameter / 2) * (diameter / 2);
        return caloriesInOneCm * squarePizza;
    }
}
