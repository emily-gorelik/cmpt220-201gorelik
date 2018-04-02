import java.util.Scanner;
public class Problem11_1 {
    
    public static void main(String[] args) {
        //asks for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side lengths of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter a color: ");
        String color = input.nextLine();

        System.out.println("Is the triangle filled (true/false)?");
        boolean filled = input.nextBoolean();

        //creates triangle object
        Triangle t = new Triangle(side1, side2, side3);
        t.setColor(color);
        t.setFilled(filled);

        //prints results
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Color: " + t.getColor());
        System.out.println("Is the triangle filled? " + t.isFilled());
        System.out.println(t);
    }

}