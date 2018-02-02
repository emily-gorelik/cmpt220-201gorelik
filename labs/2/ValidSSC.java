//problem 4.21
import java.util.Scanner;
public class ValidSSC {
    public static void main(String[] args) {
        //asks for input "ssn" 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.next(); 
        
        //checks to see if ssn is a valid social security number
        if(ssn.length() == 11 && ValidSSC.areNumbers(ssn)) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is not a valid social security number");
        }
    }
    
    //method to see if each char in the input string is a digit or a "-" where it 
    //needs to be
    private static boolean areNumbers(String s) {
        boolean isADigit = false;//only changed once everything has been checked
        //checks if places 0-2 are numbers and 3 is a "-"
        for(int i = 0; i < 3; i++) {
            if(Character.isDigit(s.charAt(i)) && s.charAt(3) == '-') {
                isADigit = true;
            }
        }
        //checks if places 4-5 are numbers and 6 is a "-"
        for(int i = 4; i < 6; i++) {
            if(Character.isDigit(s.charAt(i)) && s.charAt(6) == '-') {
                isADigit = true;
            }
        }
        //checks if places 7-10 are numbers
        for(int i = 7; i < 11; i++) {
            if(Character.isDigit(s.charAt(i))) {
                isADigit = true;
            }
        }
        return isADigit;
    }
}
