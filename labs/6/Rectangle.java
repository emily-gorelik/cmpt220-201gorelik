
public class Rectangle {
    private double width = 1;//default width
    private double height = 1;//default height
    
    //no-arg constructor
    public Rectangle() {    
    }
    
    //constructor that creates a rectangle with a set width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //method that calculates and returns area of the rectangle object
    private double getArea() {
        return width * height;
    }
    
    //method that calculates and returns perimeter of the rectangle object
    private double getPerimeter() {
        return (2 * width) + (2 * height);
    }
    
    //tester method
    public static void main(String[] args) {
        //creates two rectangle object
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        
        //prints values relating to r1
        System.out.println("--R1--");
        System.out.println("width: " + r1.width + " | height: " + r1.height + " | area: " + 
            r1.getArea() + " | perimeter: " + r1.getPerimeter());
        
        //prints values relating to r2
        System.out.println("--R2--");
        System.out.println("width: " + r2.width + " | height: " + r2.height + " | area: " + 
            r2.getArea() + " | perimeter: " + r2.getPerimeter());
    }
}
