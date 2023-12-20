package lesson18.homeWork.shape;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double heightH;

    public Triangle(String title, double sideA, double sideB, double sideC, double heightH) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightH = heightH;
    }
    @Override
    double calculatorArea() {
        return 0.5 * sideA * heightH;
    }

    @Override
    double calculatorPerimeter() {
        return sideA + sideB + sideC;
    }
}
