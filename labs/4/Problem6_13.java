
public class Problem6_13 {
    //tester method
    public static void main(String[] args) {
        //prints out labels in the table
        System.out.printf("%-10s%10s\n", "i", "m(i)");
        
        //prints data into table
        for(int i = 1; i <=20; i++) {
            System.out.printf("%-10d%10.4f\n", i, specialSum(i));
        }
    }
    
    //method that calculates the summation
    public static double specialSum(int x) {
        double num = 1;// variable that stores the value for the numerator
        double den = 2;// variable that stores the value for the denomenator 
        double sum = 0;// variable that stores the sum
        
        //adds all the numbers together
        for(int i = 0; i < x; i++) {
            sum += (num / den); 
            num++;
            den++;
        }
        return sum;
    }
}