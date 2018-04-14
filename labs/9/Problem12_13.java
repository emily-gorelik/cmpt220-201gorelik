
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem12_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }
        
        File fileName = new File(args[0]);
        if(!fileName.exists()) {
            System.out.println(fileName + " does not exist");
            System.exit(2);
        }
        
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try {
            Scanner input = new Scanner(fileName);
            while(input.hasNext()) {
                String s = input.nextLine();
                lineCount++;
                charCount += s.length();
                String[] split = s.split(" ");
                for(String word : split) {
                    wordCount++;
                }
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(); 
        }
        
        System.out.println("File " + fileName + " has");
        System.out.println(charCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }
}
