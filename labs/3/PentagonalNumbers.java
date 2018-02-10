//problem 6.1
public class PentagonalNumbers {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.printf("%10s",(i % 8 != 0) ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
