import java.util.Scanner;
public class Problem7_3 {
    //tester method
    public static void main(String[] args) {
        //ask user for the input numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[][] n = new int[2][100];
        
        //populates the array with with the user inputs 
        for (int i = 0; i < 100; i++) {
            int num = input.nextInt();
            if (num >= 100 || num <= 0) {
                break; 
            }
            n[0][i] = num;
            n[1][num] = n[1][num] + 1;
        }
        
        //prints out answer
        for (int i = 0; i < n[1].length; i++) {
            if (n[1][i] == 0) {
                continue;
            }
            if (n[1][i] > 1) {
                System.out.println(i + " occurs " + n[1][i] + " times");
            } else {
                System.out.println(i + " occurs " + n[1][i] + " time");
            }
        }
    }
}
