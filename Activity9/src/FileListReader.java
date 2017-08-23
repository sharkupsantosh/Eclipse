import java.io.File;

public class FileListReader {
	public static void main(String a[]){
		File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures");
		String[] fileList = file.list();
		for(String name:fileList){
			System.out.println(name);
		}
	}

}
