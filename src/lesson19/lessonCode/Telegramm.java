package lesson19.lessonCode;

public class Telegramm implements Messenger {

    @Override
    public void reciveMesage() {
        System.out.println("Сообщение Телеграмм получено");

    }

    @Override
    public void sendMessage() {
        System.out.println("Сообщение Телеграмм отправлено");

    }
}
