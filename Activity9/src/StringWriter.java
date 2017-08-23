import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) {
        
        BufferedWriter bufferedWriter = null;
        try {
            String strContent = "This is the String data..";
            File myFile = new File("Stringdata.txt");
            // check if file exist, otherwise create the file before writing
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            Writer writer = new FileWriter(myFile);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(strContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(bufferedWriter != null) bufferedWriter.close();
            } catch(Exception ex){
                 
            }
        }
        //read
//        try {
//            FileReader reader = new FileReader("Stringdata.txt");
//            int character;
//            System.out.print("Data Read on txt File:\n");
// 
//            while ((character = reader.read()) != -1) {
//            	
//                System.out.print((char) character);
//            }
//            reader.close();
// 
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
    }

}
