package lesson6.homeWork.exercise1;

public class CanBuy {
    public static void main(String[] args) {

        CanBuyMethod canBuyMethod1 = new CanBuyMethod();
        System.out.println("Введите открыт ли магазин Edeka:  ");
        System.out.println("==================================");
        System.out.println("Введите открыт ли магазин Rewe:  ");

        boolean isEdekaOpen = canBuyMethod1.inputisEdekaOpen();
        boolean isReweOpen = canBuyMethod1.inputisReweOpen();

        boolean canBuy = (isEdekaOpen || isReweOpen);

        if (canBuy == true) {
            System.out.println("Я могу купить еду, это " + true);
        } else {
            System.out.println("Я могу купить еду, это " + false);
        }

    }
}
