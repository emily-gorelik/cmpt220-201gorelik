import java.util.Scanner;
import java.util.ArrayList;
public class Problem11_11 {
    //tester method
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        ArrayList<Integer> list = new ArrayList<>();//assigns user input to array list
        for (int i = 0; i < 5; i++) { 
            list.add(input.nextInt());
        }
        
        sort(list);
        
        //print result
        System.out.println("Sorted list: ");
        System.out.println(list);

    }

    //sorts array list
    public static void sort(ArrayList<Integer> list) {
        list.sort(null);
    }
}
