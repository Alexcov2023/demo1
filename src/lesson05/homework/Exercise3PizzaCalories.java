package lesson05.homeWork;

public class Exercise3PizzaCalories {

    public double caloriesInPizza(double diameter, double caloriesInOneCm){
        double squarePizza = Math.PI * (diameter / 2) * (diameter / 2);
        double totalCalories = caloriesInOneCm * squarePizza;
        return totalCalories;
    }
}
