
import java.util.Scanner;
public class Problem8_5 {
    //tester method
    public static void main(String[] args) {
        //asks for user input of first matrix
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];//2D double array that will hold the first user input
        //populates matrix1 with user first input
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        
        //asks for user input of second matrix
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];//2D double array that will hold the second user input
        //populates matrix1 with second input
        for(int i = 0; i < matrix2.length; i++) {
            for(int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        
        double[][] matrixSum = addMatrix(matrix1, matrix2);//2D double array that holds the sums of the two matrices
        
        //prints result
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%2.1f ", matrix1[i][j]);
                if(i == 1 && j == 2) {
                    System.out.printf("%2s "," + ");
                } else {
                    System.out.printf("%3s ", " ");
                }
            }
            for(int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%2.1f ", matrix2[i][j]);
                if(i == 1 && j == 2) {
                    System.out.printf("%2s ", " = ");
                } else {
                    System.out.printf("%3s ", " ");
                }
            }
            for(int j = 0; j < matrixSum[i].length; j++) {
                System.out.printf("%4.1f ", matrixSum[i][j]);
            }
            System.out.println();
        }
    }
    
    //method that adds two matrices
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrixSum = new double[a.length][a[0].length];//2D array that will depict the sum of two matrices
        
        //adds matrices and populates matrixSum with their sum
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                matrixSum[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrixSum;
    }
}
