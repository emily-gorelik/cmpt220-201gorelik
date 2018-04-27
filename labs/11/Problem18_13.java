
import java.util.Scanner;
public class Problem18_13 {
    //tester method
    public static void main(String[] args) {
        //ask user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 8 integers: ");
        //populate array w/ user input
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        //print result
        System.out.println("Largest number: " + getLargest(array));
    }
    
    //method that calculates the larges int in an int array
    private static int getLargest(int[] array) {
        return getLargest(array, 0, array[0]);
    }
    
    //helper method for getLargest
    private static int getLargest(int[] array, int i, int high) {
        //base case
        if (i == array.length) {
            return high;
        }
        
        if (high < array[i]) {
            high = array[i];
        }
        return getLargest(array,i + 1, high);
    }
}
