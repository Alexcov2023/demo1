package lesson3.homework.exercice4;

public class WeatherWeekDemo {
    public static void main(String[] args) {

        WeatherWeek w1 = new WeatherWeek ();

        int result = w1.tempWeek (13, 13, 10, 9, 8, 8, 12);


        System.out.println("Средняя температура за первую неделю" + "-" + result +  "°C");

    }
}

