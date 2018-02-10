//problem 6.3
import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        
        if(isPalindrome(integer)) {
            System.out.println(integer + " is a palindrome.");
        } else {
            System.out.println(integer + " is not a palindrome.");
        }
    }
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
}
