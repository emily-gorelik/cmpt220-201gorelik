//problem 6.5
import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers (double num1, double num2, double num3) {
        double min = 0;
       
        if(num1 > num2) {
            min = num1;
            num1 = num2;
            num2 = min;
        }
        if(num2 > num3) {
            min = num2;
            num2 = num3;
            num3 = min;
        }
        if(num1 > num2) {
            min = num1;
            num1 = num2;
            num2 = min;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
