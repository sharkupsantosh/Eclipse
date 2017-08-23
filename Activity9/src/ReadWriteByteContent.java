import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteByteContent {

	public static void main(String[] args) {
		
		//read
		try {
            FileReader reader = new FileReader("temp.txt");
            int character;
            System.out.print("Data Read on txt File:\n");
 
            while ((character = reader.read()) != -1) {
            	
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		//write
		try {
			
            FileWriter writer = new FileWriter("temp.txt", true);
            writer.write("\r\n");
            writer.write("How are You?");
            writer.write("\r\n");   // write new line
            writer.write("Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		//read after write
		try {
            FileReader reader = new FileReader("temp.txt");
            int character;
            System.out.print("\n\nData Read on txt File after Writing:\n");
 
            while ((character = reader.read()) != -1) {
            	
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
