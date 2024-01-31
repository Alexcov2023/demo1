package lesson24.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*Словарь перевода слов:**
    - Создайте `HashMap`, где ключом является слово на английском языке, а значением - его перевод на другой язык.
    - Добавьте в словарь пять пар слов.
    - Выведите перевод слова, введенного пользователем.
    - Удалите слово из словаря и выведите обновленный список слов.
 */
public class HashMapTask1 {
    public static void main(String[] args) {
        Map<String, String> vocabulary = new HashMap<>();

        vocabulary.put("human", "человек");
        vocabulary.put("animal", "животное");
        vocabulary.put("bird", "птица");
        vocabulary.put("house", "дом");
        vocabulary.put("car", "машина");

        System.out.println(vocabulary);
        System.out.println("----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово на английском языке для перевода");
        String word = scanner.nextLine();

        if (vocabulary.containsKey(word)) {
            System.out.println("Слово " + word + " переводится как " + " - " + vocabulary.get(word));
        } else {
            System.out.println("Введенное слово отсутствует в словаре");
        }
        System.out.println("-----------------------------");

        vocabulary.remove("animal");
        System.out.println(vocabulary);




    }
}
