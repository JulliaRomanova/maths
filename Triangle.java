public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double angleAB;

    public Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    @Override
    public double getSquare() {
        double square = sideA * sideB * Math.sin(angleAB * Math.PI / 180);
        return square;
    }

    @Override
    public double getPerimeter() {
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(angleAB * Math.PI / 180));
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

}