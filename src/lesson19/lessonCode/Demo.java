package lesson19.lessonCode;

public class Demo {
    public static void main(String[] args) {
        Telegramm telegramm = new Telegramm();
        telegramm.reciveMesage();
        telegramm.sendMessage();
        System.out.println("==================");

        WhatsApp whatsApp = new WhatsApp();
        whatsApp.reciveMesage();
        whatsApp.sendMessage();
        System.out.println("==================");

        Viber viber = new Viber();
        viber.reciveMesage();
        viber.sendMessage();








    }

}
