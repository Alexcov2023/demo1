package lesson24.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
**Отслеживание оценок студентов:**
    - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
    - Добавьте данные пяти студентов.
    - Найдите и выведите имя студента с наивысшим средним баллом.
    - Измените средний балл одного из студентов и выведите обновленные данные.
 */
public class HashMapTask2 {
    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Viktor", 4.5);
        students.put("Olga", 3.9);
        students.put("Denis", 4.6);
        students.put("Anastasia", 4.1);
        students.put("Vladimir", 3.5);

        System.out.println(students);
        System.out.println("------------------------");

        Double maxGpa = Collections.max(students.values());
        System.out.println(maxGpa);

        String findName = null;

        for (Map.Entry<String, Double> findStudents : students.entrySet()) {
            if (maxGpa.equals(findStudents.getValue())) {
                 findName = findStudents.getKey();
             }
        }

        System.out.println(findName);

    }
}
