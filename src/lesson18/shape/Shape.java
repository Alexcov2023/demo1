package lesson18.shape;

abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    // должен бы быть метод для расчета площади геометрической фигуры и периметра

    public String getTitle() {
        return title;
    }

    abstract double calculatorArea();

    abstract double calculatorPerimeter();

}
