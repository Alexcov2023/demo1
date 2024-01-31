package lesson26.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
1) Есть класс HeavyBox с параметрами: длина, ширина, высота, вес
Создать 5-7 экземпляров которые поместить в коллекции для хранения информации об объектах, но с разной целью
а) объем коробки
б) вес
в) Владелец коробки (может быть уникальным / у владельца может быть несколько коробок)
 */
public class HeavyBoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(new HeavyBox(2, 4, 5));
        heavyBoxes.add(new HeavyBox(5, 8, 10));
        heavyBoxes.add(new HeavyBox(4, 3, 2));
        heavyBoxes.add(new HeavyBox(6, 7, 6));
        heavyBoxes.add(new HeavyBox(7, 9, 12));
        heavyBoxes.add(new HeavyBox(9, 10, 4));
        heavyBoxes.add(new HeavyBox(12, 5, 13));

        System.out.println(heavyBoxes);
        System.out.println(heavyBoxes.size());

        Set<HeavyBox> heavyBoxesSet = new TreeSet<>();









    }
}
