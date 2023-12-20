package lesson19.lessonCode;

public class Viber implements Messenger {
    @Override
    public void reciveMesage() {
        System.out.println("Сообщение Вайбер отправлено");

    }

    @Override
    public void sendMessage() {
        System.out.println("Сообщение Вайбер отправлено");

    }
}
