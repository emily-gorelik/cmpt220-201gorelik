//problem 5.16
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int integer = input.nextInt();
        
        for(int i = 2; i <= integer;) {
            if(integer % i == 0) {
                System.out.print(i + " ");
                integer /= i;
            } else {
                i++;
            }
        }
    }
}

