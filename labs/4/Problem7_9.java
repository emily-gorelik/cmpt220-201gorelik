
import java.util.Scanner;
public class Problem7_9 {
    //tester method
    public static void main(String[] args) {
        double[] n = new double[10];
        //asks user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        
        //populates array with user inputs
        for(int i = 0; i < n.length; i++) {
            n[i] = input.nextDouble();
        }
        
        //prints out result
        System.out.println("The minimum number is " + min(n));
    }
    
    //method that determines the smallest number in an array of doubles
    public static double min(double[] array) {
        double minimum = array[0];//double that stores smallest number
        
        //goes through the array index and replaces minimum with the smallest number
        for(int i = 0; i < array.length; i++ ) {
            if(minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
