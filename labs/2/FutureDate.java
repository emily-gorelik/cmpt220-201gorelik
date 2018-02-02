//problem 3.5
import java.util.Scanner;
public class FutureDate {
    public static void main(String[] args) {
        //array that stores day of the week
        String[] dayOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                                 "Thursday", "Friday", "Saturday"};
                                 
        String currentDay = ""; //innitializing variable that stores current day
        String futureDay = ""; //innitializing variable that stores the new day
        
        Scanner input1 = new Scanner(System.in);
        //ask for current day
        System.out.print("Enter today's day: ");
        int today = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        //ask for how many days passed
        System.out.print("Enter the number of days elapsed since today: ");
        int future = input2.nextInt() + today;
        
        //conditional goes back to begining of array if futureDay goes into the next week
        if(future > 6) {
            future = future % 7;
        }
        
        currentDay = dayOfTheWeek[today];//stores current day 
        futureDay = dayOfTheWeek[future];//stores new day
        //display results
        System.out.println("Today is " + currentDay + " and the future day is " + futureDay);
    }
}
