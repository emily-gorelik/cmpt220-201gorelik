
import java.util.Scanner;
public class Problem8_1 {
    //tester method
    public static void main(String[] args) {
        //asks user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];//2D double array that will hold the user input
        //populates matrix with user input
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        
        //prints result
        for(int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }
    
    //method that adds the numbers in a column of a 2D array
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;//variable that stores the sum of numbers in a column
        
        //goes through the 2D array and adds the numbers in the column
        for(int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
