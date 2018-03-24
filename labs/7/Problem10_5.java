
import java.util.Scanner;
public class Problem10_5 {
    //tester method
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        
        //assign input value to in variable
        int number = input.nextInt();
         
        //print results
        System.out.print("The prime factors are: " + toString(getPrimes(number)));
    }
    
    //method that returns prime factors of an integer in a StackOfIntegers object
    public static StackOfIntegers getPrimes(int val) {
        StackOfIntegers primes = new StackOfIntegers();//stores prime factors
        int valCopy = val;
        
        //finds prime factors
        for (int i = 2; i <= valCopy; i++) {
            if(valCopy % i == 0) {
                primes.push(i);
                valCopy /= i;
                i--;
            }
        }
        return primes;
    }
    
    //toString method
    public static String toString(StackOfIntegers primes) {
        String s = "";
        while(!primes.empty()) {
            s += primes.pop() + " ";
        }
        return s;
    }
}
