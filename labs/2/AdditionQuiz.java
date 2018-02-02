//problem 3.2
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        //generates 3 one digit numbers and stores in variables
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        int number3 = (int) (System.currentTimeMillis() / 100 % 10);
        
        //ask for players answer and store it in a variable 
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 +"? ");
        int answer = input.nextInt();
        
        //display result
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + 
        (number1 + number2 + number3 == answer));
    }
}