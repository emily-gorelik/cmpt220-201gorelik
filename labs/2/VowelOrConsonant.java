//problem 4.13
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        //asks for a letter as an input and stores input into a char
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        
        //checks if letter is a letter, and then checks if it is a vowel or consonant
        //and displays the corresponding message
        if(Character.isLetter(letter) == false) {
            System.out.println(letter + " is an invalid input");
        } else if (Character.toLowerCase(letter) == 'a' || Character.toLowerCase(letter) == 'e' || Character.toLowerCase(letter) == 'i' || Character.toLowerCase(letter) == 'o' || Character.toLowerCase(letter) == 'u') {
            System.out.println(letter + " is a vowel");         
        } else {
            System.out.println(letter + " is a consonant"); 
        }         
    }
}
