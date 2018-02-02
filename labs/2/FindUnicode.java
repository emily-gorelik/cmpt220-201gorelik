//problem 4.9
import java.util.Scanner;
public class FindUnicode {
    public static void main(String[] args) {
        //gets a character as input and stores into a variable
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String characterAsString = input.next();
        
        //stores input as a char
        char inputCharacter = characterAsString.charAt(0);
        
        //finds corresponding unicode
        int unicode = (int) inputCharacter;
        
        //displays results
        System.out.println("The Unicode for the character " + inputCharacter + " is " + unicode);
    }
}
