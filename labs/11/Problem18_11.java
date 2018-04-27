import java.util.Scanner;
public class Problem18_11 {
    //tester method
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter and integer: ");
        long n = input.nextLong();
        //print result
        System.out.println(sumDigits(n));
    }
    
    //recursive method that calculates the sum of the digits
    public static long sumDigits(long n) {
        if(n==0) {
            return 0;
        }
        return n % 10 + sumDigits (n/10);
    }
}