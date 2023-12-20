package lesson18.homeWork.shape;

import java.util.Random;

public class ShapeService {
    Random random = new Random();

/*
    public int arraySize (int x, int y) {
       int arraySize = random.nextInt(x, y);
        return arraySize;
    }

 */

    public Shape[] shapes2Complete (Shape[] array, int x, int y) {
        Shape[] array2 = new Shape [random.nextInt(x, y)];
        for (int i = 0; i < array2.length; i++) {
            int j = random.nextInt(array.length);
            array2 [i] = array [j];
        }
        return array2;
    }



   // public void completeArray ()


}
