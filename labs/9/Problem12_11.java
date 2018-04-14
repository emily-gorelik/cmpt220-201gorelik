
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem12_11 {
    public static void main(String[] args) {
        //closes program if argument is invalid
        if(args.length != 2) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }
        
        File filename = new File(args[1]);
        //checks if file exists
        if (!filename.exists()) {
            System.out.println(args[1] + " does not exist");
        }
        
        //delete all instances of the word
        String s = "";
        try {
            Scanner input = new Scanner(filename);
            while(input.hasNext()) {
                s += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        s = s.replaceAll(args[0], "");
        try {
            PrintWriter output = new PrintWriter(filename);
            System.out.println(s);
            output.write(s);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        System.out.println("Finished");
    }
}
