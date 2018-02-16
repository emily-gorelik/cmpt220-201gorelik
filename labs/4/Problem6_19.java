import java.util.Scanner;
public class Problem6_19 {
    //tester method
    public static void main(String[] args) {
        //asks for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input three possible triangle side lengths: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        //prints results
        if(isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + area(side1,side2, side3));
        } else {
            System.out.println("This is not a valide triangle");
        }
    }
    
    //method that calculates whether three specific sides make a valid triangle
    public static boolean isValid(double side1, double side2, double side3) {
        if((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) <= side1) {
            return false;
        }
        return true;
    }
    
    //method that calculates the area of a triangle
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
