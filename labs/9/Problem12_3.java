
import java.util.Scanner;
import java.util.Random;
public class Problem12_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];//make int array
        Random rand = new Random();
        //fill array with random integers
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        
        //ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number from 0 to 99: ");
        int index = input.nextInt();
        
        //print results
        if(index > 99 || index < 0) {
            System.out.print("Out of bounds");
            System.exit(1);
        } else {
            System.out.print("Number at index " + index + ": " + numbers[index]);
        }
    }
}
