import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LinebyLineReader {
	
	public static void main(String[] args) throws IOException {

        try {
            File f = new File("linedata.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file Line by Line : \n");
            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
