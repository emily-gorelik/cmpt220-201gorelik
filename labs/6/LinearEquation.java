
import java.util.Scanner;
public class LinearEquation {
    private double a = 0;//variable that stores value for a 
    private double b = 0;//variable that stores value for b
    private double c = 0;//variable that stores value for c
    private double d = 0;//variable that stores value for d
    private double e = 0;//variable that stores value for e
    private double f = 0;//variable that stores value for f
    
    //constructor that sets values for a, b, c, d, e, and f
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    //accessor method to get value of a
    private double getA() {
        return a;
    }
    
    //accessor method to get value of b
    private double getB() {
        return b;
    }
    
    //accessor method to get value of c
    private double getC() {
        return c;
    }
    
    //accessor method to get value of d
    private double getD() {
        return d;
    }
    
    //accessor method to get value of e
    private double getE() {
        return e;
    }
    
    //accessor method to get value of f
    private double getF() {
        return f;
    }
    
    //method that determines if the equation is solvable
    private boolean isSolvable() {
        if((a * d) - (b * c) != 0) {
            return true;
        }
        return false;
    }
    
    //method that solves for and returns value of x
    private double getX() {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }
    
    //method that solves for and returns value of y
    private double getY() {
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
    
    //tester method
    public static void main(String[] args) {
        //asks user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter six numbers: ");
        double[] numbers = new double[6];
        //stores user input into an integer array
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        //creates new LinearEquation object using user input
        LinearEquation le = new LinearEquation(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);
        
        //prints result
        if(le.isSolvable()) {
            System.out.println("x is " + le.getX() + " and y is " + le.getY()); 
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
