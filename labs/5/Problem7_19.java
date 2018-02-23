
import java.util.Scanner;
import java.util.Arrays;
public class Problem7_19 {
    //tester method
    public static void main(String[] args) {
        //asks user for size of list
        Scanner inputSize = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = inputSize.nextInt();//variable that stores the value of the size
        
        //asks user for contents of list
        Scanner inputContents = new Scanner(System.in);
        System.out.print("Enter the contents of the list: ");
        int[] contents = new int[size];
        //populates int array with the user input
        for(int i = 0; i < contents.length; i++) {
            contents[i] = inputContents.nextInt();
        }
        
        //prints result
        System.out.println("The list has " + size + " integers " + Arrays.toString(contents));
        if(isSorted(contents)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }
    
    //method that figures out if an int array is sorted in ascending order
    public static boolean isSorted(int[] list) {
        //goes through integer array 
        for(int i = 0; i < list.length - 1; i++) {
            //checks if integer at i is greater than the next integer; if it is method returns false
            if(list[i] > list[i+1]) {
                return false;
            }
        }
        return true;
    }
}
