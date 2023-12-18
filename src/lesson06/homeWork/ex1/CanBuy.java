package lesson06.homeWork.ex1;

public class CanBuy {
    public static void main(String[] args) {

        CanBuyMethod canBuyMethod1 = new CanBuyMethod();

        System.out.println("Введите открыт ли магазин Edeka: true or false.");
        boolean isEdekaOpen = canBuyMethod1.inputisEdekaOpen();

        System.out.println("Введите открыт ли магазин Rewe: true or false.");
        boolean isReweOpen = canBuyMethod1.inputisReweOpen();

        boolean canBuy = (isEdekaOpen || isReweOpen);

        if (canBuy == true) {
            System.out.println("Я могу купить еду, это " + true);
        } else {
            System.out.println("Я могу купить еду, это " + false);
        }

    }
}
