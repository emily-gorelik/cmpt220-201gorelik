//problem 5.13
public class WhileLoop {
    public static void main(String[] args) {
        int n = 0;
        while(Math.pow(n,3) < 12000) {
            n++;
        }
        n--;
        System.out.println(n + " is the largest integer n such that n^3 is less than 12000");
        
    }
}
