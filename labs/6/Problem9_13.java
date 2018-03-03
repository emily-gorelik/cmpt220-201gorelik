
import java.util.Scanner;
public class Location {
    private int row = 0;//variable that stores row of the maximum value in a 2D array
    private int column = 0;//variable that stores column of the maximum value in a 2D array
    private double maxValue = 0;//variable that stores maximum value in a 2D array 
    
    //no-arg constructor
    public Location() {
    }
    
    //constructor that sets values for row and column
    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    //accessor method for row
    private int getRow() {
        return row;
    }
    
    //accessor method for column
    private int getColumn() {
        return column;
    }
    
    //mutator method for maxValue
    private void setMaxValue(double newMaxValue) {
        maxValue = newMaxValue;
    }
    
    //accessor method for maxValue
    private double getMaxValue() {
        return maxValue;
    }
    
    //method that returns the location of the largest element in a 2D array
    public static Location locateLargest(double[][] a) {
        double max = a[0][0];//stores the highest number in the array
        int row = 0;//stores row of highest number
        int col = 0;//stores column of highest number
        
        //checks to see if max is the highest number and updates row and col
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(max < a[i][j]) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        Location l1 = new Location(row, col);//creates a Loation object with the correct row and column
        l1.setMaxValue(max);//sets max as the maxValue for the Location object
        return l1;
    }
    
    //tester method
    public static void main(String[] args) {
        //asks user for the number of rows and columns in their array
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int inputRow = input1.nextInt();//stores user input rows
        int inputCol = input1.nextInt();//stores user input colums
        
        double[][] findingMax = new double[inputRow][inputCol];//creates 2D array with user inputed size
        
        //asks user for 2D array
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the array: ");
        //populates array with user input
        for(int i = 0; i < findingMax.length; i++) {
            for(int j = 0; j < findingMax[i].length; j++) {
                findingMax[i][j] = input2.nextDouble();
            }
        }
        
        Location l1 = locateLargest(findingMax);//creates a Location object that has the highest value in the array
        
        //prints results
        System.out.println("The location of the largest element is " + l1.getMaxValue() + " at (" + l1.getRow() + ", " + l1.getColumn() + ")");
       
    }
}
