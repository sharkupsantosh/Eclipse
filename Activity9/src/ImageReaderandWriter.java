import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageReaderandWriter {
	public static void main(String[] args)
    {    
        File file = new File("Lighthouse.jpg");         
        BufferedImage image = null;         
        try
        {
            image = ImageIO.read(file);             
            ImageIO.write(image, "jpg", new File("output.jpg"));             
            ImageIO.write(image, "png", new File("output.png"));             
            ImageIO.write(image, "gif", new File("output.gif"));             
            ImageIO.write(image, "bmp", new File("output.bmp"));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }         
        System.out.println("Image File Read and Written Succesfully..!");
        System.out.println("Check ur Folder..!");
    }

}
