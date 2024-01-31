package lesson15.task3;

public class Task3Counter {

    public void counterWord (String input) {
        int counter = 0;

        if (input.length() != 0) {
            counter++;

            for (int i= 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
        System.out.println("Вы ввели " + counter + " слов");

    }
}
