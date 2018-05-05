/**
 * Class of static methods that will implement LFSR to encrypt or
 * decrypt an image
 * 
 * @author Emily Gorelik
 * @date May 4
 */
import java.awt.Color;
public class PhotoMagic {
    /**
     * Returns a new picture that is the result of transforming the input picture
     * using the input LFSR
     * Iterates through each pixel and changes its RGB value
     * @param image The picture being encrypted or decrypted
     * @param lfsr The LFSR object being used to change the RGB value
     * @return The encrypted or decrypted image
     */
    public static Picture transform(Picture image, LFSR lfsr) {
        int height = image.height(); //stores height of image
        int width = image.width(); //stores width of image

        //iterates through each pixel
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                Color c = image.get(i,j);

                //get new red value
                int red = c.getRed(); 
                int newRed = lfsr.generate(8)^red;

                //get new green value
                int green = c.getGreen();
                int newGreen = lfsr.generate(8)^green;

                //get new blue value
                int blue = c.getBlue();
                int newBlue= lfsr.generate(8)^blue;

                //replace color values with newly generated ones
                Color newColor = new Color(newRed, newGreen, newBlue);
                image.set(i, j, newColor);
            }
        }
        
        return image;
    }

    /**
     * Main method that read the command line arguments and displays the encrypted
     * or decrypted image
     */
    public static void main(String[] args) {
        Picture image = new Picture(args[0]); //assigns first argument to a picture object
        String seed = args[1]; //assigns second argument to a String
        int tap = Integer.parseInt(args[2]);// assigns third argument to an integer

        LFSR lfsr = new LFSR(seed, tap); //make lsfr object using user input
        
        Picture newImage = transform(image, lfsr); 
        
        newImage.show();
    }

}
