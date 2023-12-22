package lesson18.homeWork.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle("Circle1", 5);
        Shape circle2 = new Circle("Circle2", 9);
        Shape circle3 = new Circle("Circle3", 15);

        Shape square1 = new Square("Square1", 3);
        Shape square2 = new Square("Square2", 10);
        Shape square3 = new Square("Square3", 20);

        Shape rectangle1 = new Rectangle("Rectangle1", 3,4);
        Shape rectangle2 = new Rectangle("Rectangle2", 8,12);
        Shape rectangle3 = new Rectangle("Rectangle3", 20,25);

        Triangle triangle1 = new Triangle("Triangle1", 1, 2,3, 1.5);
        Triangle triangle2 = new Triangle("Triangle2", 3, 4,5, 3.5);
        Triangle triangle3 = new Triangle("Triangle3", 5, 6,7, 4.5);

        Shape[] allShapes = {circle1,circle2,circle3,square1,square2,square3,rectangle1,rectangle2,rectangle3, triangle1, triangle2, triangle3};

        ShapeService shapeService = new ShapeService();
                Shape[] shapesRandom= shapeService.shapesRandomComplete(allShapes, 3, 7);
        System.out.println("Полученный массив состоит из " + shapesRandom.length + " фигур");

        //Посчитать и вывести информацию о каждой фигуре и ее площади и периметры.
        double shapeArea = 0;
        double shapePerimeter = 0;
        String nameOfShape = null;
        for (int i = 0; i < shapesRandom.length; i++) {
            nameOfShape = shapesRandom [i].getTitle();
            shapeArea = shapesRandom[i].calculatorArea();
            shapePerimeter = shapesRandom[i].calculatorPerimeter();

            System.out.println("Фигура " + (i+1) + " - " + nameOfShape);
            System.out.println("Площадь " + shapeArea);
            System.out.println("Периметр " + shapePerimeter);
        }

        // Посчитать суммарную площадь всех фигур
        double allAreas = 0;
        double allPerimeters = 0;
        for (int i = 0; i < shapesRandom.length; i++) {
            allAreas = allAreas + shapesRandom[i].calculatorArea();
            allPerimeters = allPerimeters + shapesRandom[i].calculatorPerimeter();
        }
        System.out.println("Сумма площадей всех фигур = " + allAreas);
        System.out.println("Сумма периметров всех фигур = " + allPerimeters);

    }
}
