//problem 2.5
import java.util.Scanner;
public class CalculateTip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();
        //calculate tip
        double tip = subtotal * (gratuity / 100.0);
        //calculate total
        double total = subtotal + tip;
        //print output
        System.out.println("The gratuity is $" + tip +" and total is $" + total);
    }
}
