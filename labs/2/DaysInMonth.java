//problem 3.11
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        //set up an array of the names of the month
        String [] nameOfMonth = {"January", "February", "March", "April",
                                 "May", "June", "July", "August",
                                 "September", "October", "November", "December"};
        
        //set up scanner and ask for month number
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int monthNumber = input1.nextInt();
        
        //set up a second scanner and ask for the year
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input2.nextInt();
        
        //figure out the month that corresponds with a number
        String month = nameOfMonth[monthNumber - 1];
       
        //innitialize a variable that keeps track of the number of days in the month
        int days = 0;
        
        //figures out whether the input year is a leap year
        boolean isALeapYear = false;
        if(year % 4 == 0){
            isALeapYear = true;
        }
        
        //calculates number of days in the input month
        if(monthNumber == 2) {
            if(isALeapYear == true) {
                days = 29;
            } else {
                days = 28;
            }
        } else if(monthNumber <= 7) {
            if(monthNumber % 2 == 0) {
                days = 30;
            } else {
                days = 31;
            }
        } else if (monthNumber > 7) {
            if(monthNumber % 2 == 0) {
                days = 31;
            } else {
                days = 30;
            } 
        }
        
        //displays result
        System.out.println(month + " " + year + " has " + days + " days");
    }
}
