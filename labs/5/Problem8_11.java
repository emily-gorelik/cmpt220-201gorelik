
import java.util.Stack;
import java.util.Scanner;
public class Problem8_11 {
    //tester method
    public static void main(String[] args) {
        //ask user for input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int dec = input.nextInt();
        
        Stack<Integer> binary = decToBinary(dec);//stack that stores decimal input into its binary equivalent 
        String headsAndTails = headsAndTails(binary);//string that stores the H or T equivalent of the binary number
        
        //print result
        System.out.println(headsAndTails.substring(0,6));
        System.out.println(headsAndTails.substring(6,12));
        System.out.println(headsAndTails.substring(12,18));
    }
    
    //method that converts a decimal number into its binary equivalent
    public static Stack<Integer> decToBinary(int dec) {
        Stack<Integer> binary = new Stack<>();//integer stack that stores the binary number
        //converts decimal number into its binary equivalent
        for(int i = 8; i >= 0; i--) {
            binary.push((int) (dec / Math.pow(2,i)));
            dec = dec % (int)Math.pow(2,i); 
        }
        return binary;
    }
    
    //method that takes the binary stack and converts it into a string of H's and T's
    public static String headsAndTails(Stack<Integer> binary) {
        String sBackwards = "";//string that stores the initial conversion 
        String s = "";//string that stores the conversion in the correct order
        
        //goes through the stack and adds an H or T to sBackwords
        while(!binary.isEmpty()) {
            for(int i = 0; i < 9; i++) {
                if(binary.pop() == 0) {
                    sBackwards += "H ";
                } else {
                    sBackwards += "T ";
                }
            }
        }
        
        //puts the string in the correct order
        for(int i = sBackwards.length() - 1; i >= 0; i--) {
            s += sBackwards.charAt(i);
        }
        return s;
    }
}
