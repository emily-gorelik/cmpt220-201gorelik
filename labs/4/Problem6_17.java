import java.util.Scanner;
public class Problem6_17 {
    //tester method
    public static void main(String[] args) {
        //asks for user input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        //prints result
        printMatrix(n);
    }
    
    //method that creates and prints the matrix of 1s and 0s
    public static void printMatrix(int n) {
        //creates each row and collumn 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                //randomly generates and prints a 1 or 0
                System.out.printf("%3d", (int)(Math.random() * 2));
            }
            System.out.println("");
        }
    }
}
