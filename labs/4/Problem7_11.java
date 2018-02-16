
import java.util.Scanner;
public class Problem7_11 {
    //tester method
    public static void main(String[] args) {
        //asks user for input
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        
        //populates an array with user input
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        //prints out results
        System.out.println("The mean is: " + mean(numbers));
        System.out.println("The standard deviation is: " + deviation(numbers));
    }
    
    //method that calculates the standard deviation of an array of doubles
    public static double deviation(double[] x) {
        double mean = mean(x);// variable that stores the mean 
        double deviation = 0;// variable that stores the standard deviation
        
        //calculates standard deviation
        for(int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    
    //method that calculates the mean of a set of doubles in an array
    public static double mean(double[] x) {
        double sum = 0;// variable that stores the sum of all numbers in the array
        
        //calculates the sum of the numbers in the array
        for(int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        
        //calculates and returns the mean
        return sum / x.length;
    }
}
