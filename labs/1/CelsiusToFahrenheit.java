//poblem 2.1
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        //read the temperature for the user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a temperature value in Celsius: ");
        double celsius = input.nextDouble();
        //convert celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;
        //display result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
