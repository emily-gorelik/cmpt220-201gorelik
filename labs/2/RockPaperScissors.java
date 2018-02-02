//problem 3.17
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rockPaperScissors= {"Rock", "Paper", "Scissors"};//array to store possible selesctions
        
        //selection of computer is stored
        int computer = (int)(Math.random() * 3);
        
        //asks user for their choice and stores into a variable
        Scanner input = new Scanner(System.in);
        System.out.print("rock(0), paper(1), scissors(2)");
        int player = input.nextInt();
        
        //matches choices of computer and player to object in the array
        String computerPlayed = rockPaperScissors[computer];
        String playerPlayed = rockPaperScissors[player];
        
        //displays result of game
        if(RockPaperScissors.isADraw(computer, player)) {
            System.out.println("The computer is " + computerPlayed + ". You are " 
            + playerPlayed + " too. It is a draw.");
        } else if(RockPaperScissors.playerWins(player, computer)){
            System.out.println("The computer is " + computerPlayed + ". You are " 
            + playerPlayed + ". You won.");
        } else {
            System.out.println("The computer is " + computerPlayed + ". You are " 
            + playerPlayed + ". Computer wins.");
        }
    }
    
    //checks to see if computer and player played the same item
    private static boolean isADraw(int a, int b) {
        return a == b;
    }
    
    //checks to see if player wins round
    private static boolean playerWins(int a, int b) {
        if(a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b == 1) {
            return true;
        } 
        return false;
    }
}
