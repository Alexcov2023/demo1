package lesson18.homeWork.shape;

public class ShapeDemoDifferent {
    public static void main(String[] args) {

        ShapeService shapeService = new ShapeService();
        Shape[] shapes = shapeService.shapesComplete(5,8);
        System.out.println("Полученный массив состоит из " + shapes.length + " фигур");

        //Посчитать и вывести информацию о каждой фигуре и ее площади и периметры.
        double shapeArea = 0;
        double shapePerimeter = 0;
        String nameOfShape = null;
        for (int i = 0; i < shapes.length; i++) {
            nameOfShape = shapes[i].getTitle();
            shapeArea = shapes[i].calculatorArea();
            shapePerimeter = shapes[i].calculatorPerimeter();

            System.out.println("Фигура " + (i+1) + " - " + nameOfShape);
            System.out.println("Площадь " + shapeArea);
            System.out.println("Периметр " + shapePerimeter);
        }

        // Посчитать суммарную площадь всех фигур
        double allAreas = 0;
        double allPerimeters = 0;
        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculatorArea();
            allPerimeters = allPerimeters + shapes[i].calculatorPerimeter();
        }
        System.out.println("Сумма площадей всех фигур = " + allAreas);
        System.out.println("Сумма периметров всех фигур = " + allPerimeters);

    }
}
