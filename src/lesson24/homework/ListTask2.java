package lesson24.homework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
**Операции с числовым списком:**
    - Создайте `LinkedList` для хранения целых чисел.
    - Добавьте в список случайные числа в диапазоне от 1 до 100.
    - Найдите и выведите максимальное и минимальное числа в списке.
    - Отсортируйте список в порядке возрастания и выведите его.
 */
public class ListTask2 {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println(integers);
        System.out.println("----------------------");

        System.out.println(Collections.max(integers));
        System.out.println(Collections.min(integers));
        System.out.println("----------------------");

        Collections.sort(integers);
        System.out.println(integers);



    }
}
