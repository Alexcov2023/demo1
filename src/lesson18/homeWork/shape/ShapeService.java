package lesson18.homeWork.shape;

import java.util.Random;

public class ShapeService {
    Random random = new Random();
    /*
    создане массива случайных фигур из большого количества фигур в другом массиве.
     */
    public Shape[] shapesRandomComplete (Shape[] allShapes, int x, int y) {
        Shape[] shapesRandom = new Shape [random.nextInt(x, y)];
        for (int i = 0; i < shapesRandom.length; i++) {
            int j = random.nextInt(allShapes.length);
            shapesRandom [i] = allShapes [j];
        }
        return shapesRandom;
    }
    /*
    В цикле по массиву (от 0 до 3)
для каждого элемента этого массива вы делаете следующее:
  1) рандомно получаете значение от 0 до 3
  2) в зависимости от этого значения с помощью switch вы создаете новый объект Shape , но
  если 0 - Shape newShape = new Circle();
  если 1 - Shape newShape = new Square();
  ... и т. д.
  3) в текущий элемент массива вы сохраняете newShape
     */
    public Shape[] shapesComplete (int x, int y) {
        Shape[] shapes = new Shape [random.nextInt(x, y)];
        for (int i = 0; i < shapes.length; i++) {
            int z = random.nextInt(3);
            if (z == 0) {shapes[i] = new Circle("circle1", 3);
            } else if (z == 1) {shapes[i] = new Rectangle("rectangle1", 4, 5);
            } else if (z == 2) {shapes[i] = new Square("square1", 6);
            } else if (z == 3) {shapes[i] = new Triangle("triangle1", 2, 3, 4, 3.5);
            }
        }
        return shapes;
    }

}
