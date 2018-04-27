import java.util.Scanner;
public class Problem18_17 {
    //tester method
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters in one line: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        //create and populate char array
        char[] chars = s.replaceAll(" ", "").toCharArray();
        //print results
        System.out.print("The letter " + ch + " occurs " + count(chars, ch) + " times");
    }

    //counts how many times a char appears in a char array
    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    //helper method for count
    public static int count(char[] chars, char ch, int high) {
        int count = (chars[high] == ch) ? 1 : 0;
        //base case
        if(high == 0) {
            return count;
        } 
        
        return count + count(chars, ch, high - 1);
    }
}
