package lesson11.lessoncode.sort.sort;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student(1,"Sergey","39.2");
        Student student2 = new Student(2,"Vladimir","39.2");
        Student student3 = new Student(3,"Andrii","39.2");
        Student student4 = new Student(4,"Anastasiia","39.2");
        Student student5 = new Student(5,"Ruslan","40");
        Student student6 = new Student(6,"Viktor","40");
        Student student7 = new Student(7,"John","40");

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));

        ArraySortStudent sortStudent = new ArraySortStudent();

        System.out.println("Сортировка по имени");
        sortStudent.bubbleSortName(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Сортировка по группе");
        sortStudent.bubbleSortGroup(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Сортировка по ID");
        sortStudent.bubbleSortById(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Упрощенный код сортировки по имени");
        sortStudent.bubbleSortNameSimpl(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Другой код сортировки по ID");
        sortStudent.bubbleSortByIdOth(students);
        System.out.println(Arrays.toString(students));

        System.out.println("Другой код сортировки по имени");
        sortStudent.bubbleSortNameOther(students);
        System.out.println(Arrays.toString(students));


    }
}
