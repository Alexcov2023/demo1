package lesson5.homeWork;

public class Exexrcise1IStudyBasicJava {

    /*
1. Задание №1
   1 Создайте строку через new - I study Basic Java!
   2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
   3 Распечатать последний символ строки. Используем метод String.charAt().
   4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
   5 Заменить все символы “а” на “о”.
   6 Преобразуйте строку к верхнему регистру.
   7 Преобразуйте строку к нижнему регистру.
   8 Вырезать строку Java c помощью метода String.substring().
 *
     */
//2
    public void StringMyStr(String myStr) {
    }
    public static void main(String[] args) {
//1
        String myStr = new String("I study Basic Java!");
        System.out.println(myStr);
//3
        System.out.println(myStr.length());
        char lastSymbol = myStr.charAt(18);
        System.out.println(lastSymbol);
//4
        String strJava = "Java";
        boolean containMyStrJava = myStr.contains(strJava);
        System.out.println("Основная строка содержит подстроку Java -" + containMyStrJava);
//5
        String replaceAtoO = myStr.replaceAll("a", "o");
        System.out.println(replaceAtoO);
//6
        String myStrAfterToUpperCase = myStr.toUpperCase();
        System.out.println(myStrAfterToUpperCase);
//7
        String myStrAfterToLowerCase = myStr.toLowerCase();
        System.out.println(myStrAfterToLowerCase);

        String myStrCutJava = myStr.substring(14,18);
        System.out.println(myStrCutJava);

    }
}












