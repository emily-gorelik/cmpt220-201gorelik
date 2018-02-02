//problem 2.7
import java.util.Scanner;
public class CalculateYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user
        System.out.print("Enter a number of minutes: ");
        long minutes = input.nextLong(); 
        //calculate years and remaining days
        long years = minutes / (365 * 24 * 60);
        long days = minutes % (365 * 24 * 60) / (24 * 60);
        //output
        System.out.println(minutes + " minutes is approximately " + years + " years and "
         + days + " days");
    }
}
