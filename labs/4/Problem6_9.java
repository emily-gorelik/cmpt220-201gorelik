
public class Problem6_9 {
    //tester class
    public static void main(String[] args_) {
        //prints out labels of the table
        System.out.printf("%-10s%10s | %-10s%10s\n", 
            "Feet", "Meters", "Meters", "Feet");
            
        //prints out results into the table
        for(double f = 1.0, m = 20.0 ; f <= 10.0; f++, m += 5) {
            System.out.printf("%-10.1f%10.3f | %-10.1f%10.3f\n", f, footToMeter(f),
                m, meterToFoot(m));
        }
    }
    
    //method that converst feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    
    //method that converst meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
