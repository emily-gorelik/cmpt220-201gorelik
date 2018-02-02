//problem 2.9
import java.util.Scanner;
public class CalculateAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();
        
        //calculate accelertation 
        double acceleration = (v1 - v0) / time;
        
        //display information
        System.out.println("The average acceleration is " + acceleration);
    }
}
