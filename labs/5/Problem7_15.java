
import java.util.Scanner;
import java.util.Arrays;
public class Problem7_15 {
    //tester method
    public static void main(String[] args) {
        //asks for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        //populates array with input numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        
        //creates array with no duplicates
        int[] noDuplicates = eliminateDuplicates(numbers);
        
        //displays result
        System.out.println("The distinct numbers are " + Arrays.toString(noDuplicates));
    }
    
    //method that eliminates duplicates from an integer array
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];//temporary array to hold values
        int index = 0;//index for later array
        
        //goes through list and finds duplicates 
        for(int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;//boolean that keeps track of whether a number is a duplicate
            //compares each number in array to number at i 
            for(int j = 0; j < list.length; j++) {
                //changes isDuplicate to true if a duplicate was found
                if(temp[j] == list[i]) {
                    isDuplicate = true;
                }
            }
            //if the number is not a duplicate it gets added to the temp array
            if(!isDuplicate) {
                temp[index++] = list[i];
            }
        }
        
        int[] newList = new int[index];//a new array that will be populated by each distinct number
        
        //populates newList with the distinct numbers
        for(int i = 0; i < index; i++) {
            newList[i] = temp[i];
        }
        return newList;
    }
}
