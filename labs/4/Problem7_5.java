
import java.util.Scanner;
public class Problem7_5 {
    //tester method
    public static void main(String[] args) {
        //ask user for input
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int index = 0;
        System.out.print("Enter 10 numbers: ");
        
        //populates a new array with each distinct number in the user input
        for(int i = 0; i < numbers.length; i++) {
            int num = input.nextInt();
            if(isDistinct(numbers, num)) {
                numbers[index++] = num;
            }
        }
        
        //prints out result
        System.out.println("The number of distinct number is " + index);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
    //a method that determines if number is distinct or not
    public static boolean isDistinct(int[] numbers, int n) {
        for(int i: numbers) {
            if(n == i) {
                return false;
            }
        }
        return true;
    }
}
