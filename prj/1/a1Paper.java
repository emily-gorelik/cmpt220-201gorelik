
import java.util.Scanner;
public class a1Paper {
    //tester method
    public static void main(String[] args) {
        //scanner for user input
        Scanner input = new Scanner(System.in);
        
        int aSize = input.nextInt() - 1;//sets size of the paper array
        int squared = (int)Math.pow(2, aSize);
        
        int[] paper = new int[aSize];
        
        //stores user input in an array
        for(int i = 0; i < paper.length; i++) {
            paper[i] = input.nextInt();
        }
        
        //if statement decide what to print
        if(isPossible(paper, squared)) {
            int sum = 0;//variable that stores 
            int squaredInit = squared;//stores original value of squared
            int index = 0;//variable that stores value for the index of an array
            
            //populates paper with new values
            for(int i = 0; i < paper.length; i++) {
                squared /= 2;
                sum += squared * paper[i];
                if(sum >= squaredInit) {
                    index = i;
                    int difference = sum - squaredInit;
                    paper[index] -= difference;
                    break;
                }
            }
            int[] paperCopy = new int[index + 1];//array that stores the contents of paper
            //populates paperCopy
            for(int i = 0; i < index + 1; i++) {
                paperCopy[i] = paper[i];
            }
            
            double length = 0;//double that stores length of paper
            double constant = Math.pow(2, -((2 * index + 3.0) / 4));// a constant needed to calculate length
            
            //calculates length
            for(int i = index; i >= 0; i--) {
                length += (paperCopy[i] / 2) * constant;
                if(i == 0) { 
                    break; 
                }
                paperCopy[i - 1] += paperCopy[i] / 2;
                constant *= Math.sqrt(2);
            }
            System.out.println(length);
        } else {
            System.out.println("impossible");
        }
    }
    
    //method that figures out if there is enough paper to make and A1 sheet
    public static boolean isPossible(int[] numbers, int squared) {
        int sum = 0;
        int squaredInit = squared;
        for(int i = 0; i < numbers.length; i++) {
            squared /= 2;
            sum += squared * numbers[i];
            if(sum >= squaredInit) {
                return true;
            }
        }
        return false;
    }
}
