
public class Triangle extends GeometricObject {
    //side lengths
    private double side1;
    private double side2;
    private double side3;

    //constructs default triangle object
    Triangle() {
        this.side1 = 1.0;		
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    //contructs traingle 
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //calculates and returns area of triangle
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) - (s - side3));
    }

    //calculates and returns perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //toString method
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}