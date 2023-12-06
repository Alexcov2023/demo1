package lesson8.homeWork.ExampleArrayLMS;

public class ExempleArrayLMS3 {

    public static void main(String[] args) {

        // Создание и инициализация двумерного массива
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Вывод элементов двумерного массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // переход на новую строку после каждой строки матрицы
        }
    }
}

