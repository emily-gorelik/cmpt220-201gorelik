
import java.util.Date;
public class Problem9_3 {
    //tester method
    public static void main(String[] args) {
        long time = 10000;//initial value for the time
        
        //increments time eight times, makes a new Date object and prints out each incrimented time
        for(int i = 0; i < 8; i++, time *= 10) {
            Date date = new Date(time);
            System.out.println(date.toString());
        }
    }
    
}
