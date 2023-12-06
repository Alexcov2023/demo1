package lesson6.lessonCode;

public class SwitchExample {

    public static void main(String[] args) {

        String drink = "coffee";
        switch (drink) {
            case "coffee":
                System.out.println("I would go for Java!");
                break;

            case "tea":
                System.out.println("Everything but Lipton");
                break;

            default:
                System.out.println("Ugh.. What?");
        }

    }
}
