
/**
 * Class of static methods that implement the xor function and converts a binary number
 * into a base ten integer. These methods will be used by the LSFR class. 
 * 
 * @author Emily Gorelik 
 * @version May 4
 */
public class Helper {
    /**
     * Implements the exclusive OR funtion on two chars
     * @param a One bit of data stored as a character which XOR will be used on
     * @param b Another bit of data stored as a character which XOR will be used on
     * @return The result of implementing the XOR function on a and b or 'e' if a or b are not 0 or 1
     */
    public static char xor(char a, char b) {
        String aXorB = ""; //String to store a^b
        
        //turn a into an int if it is 1 or 0
        if ( a == '1' || a == '0') {
            int intA = Character.getNumericValue(a);
        } else {
            System.out.println("Error: not 1 or 0");
            return 'e';
        }
        
        //turn b into an int if it is 1 or 0
        if (b == '1' || b == '0') {
            int intB = Character.getNumericValue(b);
        } else {
            System.out.println("Error: not 1 or 0");
            return 'e';
        }
        
        aXorB = Integer.toString(a^b); 
       
        return aXorB.charAt(0);
    }
    
    /**
     * Takes a String representing a binary number and outputs the corresponding base 10 integer
     * @param binary A string representation of a binary number
     * @return The base 10 value of binary or -1 if binary was not a binary number
     */
    public static int binaryToDec(String binary) {
        int dec = 0; //stores base ten value of binary
        int place = 0;//stores the number that 2 is being raised to
        
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1' || binary.charAt(i) == '0') {
                place = binary.length() - 1 - i;
                dec = dec + (Integer.parseInt(binary.substring(i,i+1)) * (int) Math.pow(2,place));
            } else {
                System.out.println("Error: not a binary number");
                return -1;
            }
        }
        
        return dec;
    }
    
    /**
     * Main method that tests xor() and binaryToDec() with various inputs
     */
    public static void main(String[] args) {
        // testing xor
        
        char a = xor('0','0');
        System.out.println("XOR of 0 and 0. Expected output 0. Actual output " + a);
        
        char b = xor('1','1');
        System.out.println("XOR of 1 and 1. Expected output 0. Actual output " + b);

        char c = xor('1','0');
        System.out.println("XOR of 1 and 0. Expected output 1. Actual output " + c);

        char d = xor('0','1');
        System.out.println("XOR of 0 and 1. Expected output 1. Actual output " + d);
        
        char e = xor('1','5');
        System.out.println("XOR of 1 and 5. Expected output e. Actual output " + e);
        
        char f = xor('0','5');
        System.out.println("XOR of 0 and 5. Expected output e. Actual output " + f);
        
        char g = xor('9','8');
        System.out.println("XOR of 9 and 8. Expected output e. Actual output " + g);
        
        char h = xor('7','1');
        System.out.println("XOR of 7 and 1. Expected output e. Actual output " + h);
        
        char i = xor('6','0');
        System.out.println("XOR of 6 and 0. Expected output e. Actual output " + i);
        
        // testing binaryToDec
        
        int z = binaryToDec("11110");
        System.out.println("binaryToDec of 11110. Expected output 30. Actual output " + z);
        
        int y = binaryToDec("1010");
        System.out.println("binaryToDec of 1010. Expected output 10. Actual output " + y);
        
        int x = binaryToDec("10011111");
        System.out.println("binaryToDec of 10011111. Expected output 159. Actual output " + x);
        
        int w = binaryToDec("11");
        System.out.println("binaryToDec of 11. Expected output 3. Actual output " + w);
        
        int v = binaryToDec("1131");
        System.out.println("binaryToDec of 1131. Expected output -1. Actual output " + v);
    }
}
