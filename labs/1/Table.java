//problem 1.4
public class Table {
    public static void main(String[] args) {
        System.out.println("a       a^2     a^3"); // prints first row of table
        int num = 1; // initializes number used in second row
        //prints the rest of the rows
        for(int i = 0; i < 4; i++) {
            System.out.println(num + "       " + (int)Math.pow(num, 2) + "       " + (int) Math.pow(num, 3));
            num++;
        }
    }
}
