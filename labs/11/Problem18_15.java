import java.util.Scanner;
public class Problem18_15 {
    //tester method
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        //print results
        System.out.println("The letter " + ch + " occurs " + count(str, ch) + " times");
    }
    
    //recursive method that calculates how often a char appears in a string
    public static int count(String str, char ch) {
        return count(str, ch, str.length() - 1);
    }

    //helper method for count
    public static int count(String s, char ch, int high) {
        int n = (ch == s.charAt(0)) ? 1 : 0;
        //base case
        if(high <= 0) {
            return n;
        }
        
        return n + count(s.substring(1), ch, high - 1);
    }

}
