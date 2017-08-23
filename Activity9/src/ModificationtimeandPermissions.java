import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ModificationtimeandPermissions {
	public static void main(String a[]) throws IOException{
		File modfile = new File("Lighthouse.jpg");
		System.out.println(modfile.lastModified());
		
		File file = new File("Lighthouse.jpg");
        System.out.println( "Does the File exist:"  + file.exists() );
        System.out.println( "Doc is file:"  + file.isFile() );
        System.out.println( "can the doc be read:" + file.canRead() );
        System.out.println( "can we execute:" + file.canExecute() );
        System.out.println( "can we write:" + file.canWrite() );
        System.out.println( "Is the file hidden:" + file.isHidden() );

        System.out.println("change it to be unreadable, and it works? " + file.setReadable(false));
        System.out.println( "can the file be read:" + file.canRead() );
        System.out.println("change it to be writable, and it works? " + file.setWritable(true));
        System.out.println( "can the file be write:" + file.canWrite() );
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read();
        fileInputStream.close();

	}
}
