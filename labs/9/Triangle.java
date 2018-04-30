// JA: No test class?
public class Triangle extends GeometricObject {
    //side lengths
    private double side1;
    private double side2;
    private double side3;

    //constructs default triangle object
    public Triangle() {
        this.side1 = 1.0;       
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    //contructs traingle 
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        isValidTriangle();
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
    
    private void isValidTriangle() throws IllegalTriangleException {
        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }
    
    
    
    public class IllegalTriangleException extends Exception{
        private double s1;
        private double s2;
        private double s3;
        
        public IllegalTriangleException(double s1, double s2, double s3) {
            super("Not a real triangle");
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
    }
    public static void main(String[] args) {
        Triangle t1;
        try {
            t1 = new Triangle(1, 1, 200);        
        } catch(IllegalTriangleException e){
            e.printStackTrace();
        }
        System.out.println("fuck");
    }
}