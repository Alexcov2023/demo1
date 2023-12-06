package lesson13.lessonCode;

import java.util.Arrays;

public class SchoolApp2 {
    public static void main(String[] args) {

        Student studentsElena = new Student("Elena", 1);
        Student studentsValeria = new Student("Valeria", 1);
        Student studentsOtalbec = new Student("Otalbec", 3);

        Student[] students = new Student[3];

        students[0] = new Student("Elena", 1);

        System.out.println(studentsElena);
        System.out.println(studentsValeria);
        System.out.println(studentsOtalbec);
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(students));

    }
}
