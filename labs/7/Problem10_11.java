
public class Circle2D {
    private double x;//stores x coordinate of center of circle
    private double y;//stores y coordinate of center of circle
    private double radius;//stores radius of circle

    //no-arg constructor
    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    //contructor that assigns specific values to x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //accessor method for x
    private double getX() {
        return x;
    }

    //accessor method for y
    private double getY() {
        return y;
    }

    //accessor method for radius
    private double getRadius() {
        return radius;
    }

    //method that calculates and returns area of circle
    private double getArea() {
        return Math.PI * radius * radius;
    }

    //method that calculates and returns perimeter of circle
    private double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //method that returns true if coordinates fall inside cirlce
    private boolean contains(double x, double y) {
        return distance(x, y) < radius;
    }

    //method that returns true if input circle object falls inside circle object
    private boolean contains(Circle2D circle) {
        return distance(circle.x, circle.y) <= Math.abs(radius - circle.radius);
    }

    //method that returns true if input circle object overlaps other circle object
    private boolean overlaps(Circle2D circle) {
        return distance(circle.x, circle.y) <= radius + circle.radius
        && !contains(circle);
    }

    //method that calculates and returns distance between a point and center of the circle
    private double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    //tester method
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        
        //print results
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Contains (3,3)? " + c1.contains(3,3));
        System.out.println("Contains c2? " + c1.contains(c2));
        System.out.println("Overlaps c2? " + c1.overlaps(c2));
    }
}
