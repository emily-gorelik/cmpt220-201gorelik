
/**
 * A template for an LFSR object. An LFSR object is a register that generates pseudo-random numbers, possibly for
 * decription
 * 
 * @author Emily Gorelik
 * @version May 4
 */
public class LFSR {
    /**
     * position of the bit that will be used with the leftmost bit in the xor method
     */
    private int tap;
    /**
     * int array of ones and zeros stored in order
     */
    private int[] register;
    /**
     * string of ones and zeros stored in order
     */
    String seed;

    /**
     * Constructor for the LFSR object
     * @param seed Initial string of ones and zeros 
     * @param tap Initial position of the bit that will be used with the leftmost bit in the exlusive or method
     */
    public LFSR(String seed, int tap) {
        this.tap = tap;
        this.seed = seed;
        register = new int[seed.length()];
        
        //populate register 
        for(int i = 0; i < register.length; i++) {
            register[i] = Character.getNumericValue(seed.charAt(i));
        }
    }

    /**
     * Returns a string representation of the LFSR to print the object to the console  
     * @return String representation of the LSFR
     */
    public String toString() {
        String s = "";
        
        for(int i = 0; i < register.length; i++) {
            s = s + register[i];
        }
        
        return s;
    }

    /**
     * Stimulates one shift of the LFSR
     * @return The new rightmost bit that was shifted in 
     */
    public int step() {
        String newSeed = ""; //stores seed after one shift
        
        //performs shift 
        for(int i = 0; i < register.length; i++) {
            //acts based on if i is the rightmost bit
            if( i < register.length - 1) {
                register[i] = register[i + 1];
            } else {
                char a = Helper.xor(seed.charAt(0), seed.charAt(tap));
                register[i] = Character.getNumericValue(a);
            }
            newSeed = newSeed + register[i]; 
        }
        
        this.seed = newSeed;//replaces old seed with newSeed
        
        return register[register.length - 1];
    }

    /**
     * Simulates k steps of the LFSR
     * @param k Number of steps of the LFSR
     * @return The non-negative integer in base ten represented by the new k rightmost bits in the register
     */

    public int generate(int k) {
        //performs step k times
        for(int i = 0; i < k; i++) {
            step();
        }
        
        return Helper.binaryToDec(seed.substring(seed.length() - k, seed.length()));
    }

    /**
     * Main method that instatiates an LFSR object and tests all methods
     */
    public static void main(String[] args) {
        LFSR lfsr = new LFSR("01101000010", 2);
        System.out.println(lfsr);
        
        System.out.println();
        //test step
        for(int i = 0; i < 10; i++) {
            int bit = lfsr.step();
            System.out.println(lfsr + " " + bit);
        }
        
        System.out.println();
        //test generate
        for(int i = 0; i < 10; i++) {
            int r = lfsr.generate(5);
            System.out.println(lfsr + " " + r);
        }
    }
}
