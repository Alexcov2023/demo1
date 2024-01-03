package lesson11.homeWork.serch;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryAndLinearSearch {

    public static void main(String[] args) {

        /*
    1. написать код для бинарного поиска
    Задание найти элемент "89" в массиве чисел
     */
    //встроенный в Java бинарный поиск
        int[] arrayNumbers = {5, 12, 17, 19, 21, 28, 34, 39, 42, 46, 50, 53, 58, 67, 71, 83, 89, 95, 102, 247};
        System.out.println("Число '89' находится в массиве под индексом " + Arrays.binarySearch(arrayNumbers, 89));
        System.out.println("=============================================================================================");

    // самостоятельно написанный бинарный поиск
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число из массива " + Arrays.toString(arrayNumbers));
        int searchNumber = scanner.nextInt();
        BinarSearchCode binarSearchCode = new BinarSearchCode();
        System.out.println("Число " + searchNumber + " находится в нашем массиве под индексом " + binarSearchCode.indexOfSearch(arrayNumbers, searchNumber));




    // linear search for array with String
        String[] arrayStringForSearch = {"лошадь", "жираф", "лев", "антилопа", "удав", "леопард", "крокодил", "бегемот", "черепаха", "обезьяна", "ягуар"};

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите название животного");
        String searchAnimal = scanner1.nextLine();

        int indexOfSearchAnimal = -1;

        for (int i = 0; i < arrayStringForSearch.length; i++) {
            if (arrayStringForSearch[i].equals(searchAnimal)){
                indexOfSearchAnimal = i;
            }
        }

        if (indexOfSearchAnimal >= 0){
            System.out.println("Животное " + searchAnimal + " находится в нашем массиве под индексом " + indexOfSearchAnimal);
        } else {
            System.out.println("В нашем массиве нет животного под названием " + searchAnimal);
        }

    }
}
