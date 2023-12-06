package lesson3.homework;

public class Exercise3 {
    public static void main(String[] args) {
        int goodsA = 1000;
        int goodsB = 500;

        int rebate = 100;

        int price = goodsA + goodsB - rebate;

        System.out.println("Стоимость товаров со скидкой" + " " + price + " " + "руб.");
        System.out.println("Скидка составила" + " " + rebate + " " + "руб.");

    }
}
