
public class MyInteger {
    private int value = 0;//default integer value

    //constructor that assigns value to value variable
    public MyInteger(int value) {
        this.value = value;
    }
    
    //accessor method for value 
    private int getValue() {
        return value;
    }
    
    //method that returns true if value is even
    private boolean isEven() {
        return this.value % 2 == 0;
    }
    
    //static method that returns true if val is even
    private static boolean isEven(int val) {
        return val % 2 == 0;
    }
    
    //static method that returns true if MyInteger object has even value
    private static boolean isEven(MyInteger val) {
        return val.getValue() % 2 == 0;
    }
    
    //method that returns true if value is odd
    private boolean isOdd() {
        return !isEven();
    }
    
    //static method that returns true if val is odd 
    private static boolean isOdd(int val) {
        return !isEven(val);
    }
    
    //static method that returns true if MyInteger object has odd value
    private static boolean isOdd(MyInteger val) {
        return !isEven(val);
    }
    
    //method that returns true if value is a prime number
    private boolean isPrime() {
        for(int i = 2; i <= this.value / 2; i++) {
            if(this.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //static method that returns true if val is a prime number
    private static boolean isPrime(int val) {
        for(int i = 2; i <= val / 2; i++) {
            if(val % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //static method that returns true if MyIntefer value is a prime number
    private static boolean isPrime(MyInteger val) {
        for(int i = 2; i <= val.getValue() / 2; i++) {
            if(val.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //method that returns true if value is equal to val
    private boolean equals(int val) {
        return getValue() == val;
    }
    
    //method that returns true if value is equal to another MyInteger object's value
    private boolean equals(MyInteger val) {
        return getValue() == val.getValue();
    }
    
    //method that parses an char array into an integer
    private static int parseInt(char[] val) {
        return Integer.parseInt(String.valueOf(val));
    }
    
    //method that parses a String into an integer
    private static int parseInt(String val) {
        return Integer.parseInt(val);
    }
    
    //test method
    public static void main(String[] args) {
        //create random MyInteger objects and int variables to compare
        MyInteger tester = new MyInteger((int) (Math.random() * 100));
        int intTester = (int) (Math.random() * 100);
        MyInteger secondTester = new MyInteger((int) (Math.random() * 100));
        
        //prints results
        System.out.println("---MyInteger tester is " + tester.getValue() + "---");
        System.out.println("Is even? " + tester.isEven());
        System.out.println("Is odd? " + tester.isOdd());
        System.out.println("Is prime? " + tester.isPrime());
        
        System.out.println("---int tester is " + intTester + "---");
        System.out.println("Is even? " + isEven(intTester));
        System.out.println("Is odd? " + isOdd(intTester));
        System.out.println("Is prime? " + isPrime(intTester));
        
        System.out.println("---static method test using tester---");
        System.out.println("Is even? " + isEven(tester));
        System.out.println("Is odd? " + isOdd(tester));
        System.out.println("Is prime? " + isPrime(tester));
        
        System.out.println("---");
        System.out.println("is tester and intTester equal? " + tester.equals(intTester));
        System.out.println("second tester is " + secondTester.getValue() +". is tester and secondTester equal? " + tester.equals(secondTester));
    }
}
