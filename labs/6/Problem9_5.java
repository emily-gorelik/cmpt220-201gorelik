
import java.util.GregorianCalendar;
public class Problem9_5 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();// create GregorianCalendar object
        
        //display current year, month, and day
        System.out.println("--CURRENT--");
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
        
        
        gc.setTimeInMillis(1234567898765L);//set time ellapsed
        
        //show date after certain amount of elapsed time since jan 1 1970
        System.out.println("--ELAPSED--");
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
