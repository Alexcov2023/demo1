package lesson24.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
**Управление списком студентов:**
    - Создайте `ArrayList` для хранения имен студентов.
    - Добавьте в список пять имен студентов.
    - Выведите список студентов в обратном порядке.
    - Удалите студента из списка по индексу и выведите обновленный список.
 */
public class ListTask1 {
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Ivanov");
        studentNames.add("Loginov");
        studentNames.add("Petrov");
        studentNames.add("Smirnov");
        studentNames.add("Kozlov");

        System.out.println(studentNames);
        System.out.println("==============================");

        Collections.reverse(studentNames);
        System.out.println(studentNames);
        System.out.println("==============================");

        studentNames.remove(2);
        System.out.println(studentNames);



    }
}
