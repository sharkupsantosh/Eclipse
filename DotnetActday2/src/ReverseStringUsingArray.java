import java.io.*;


public class ReverseStringUsingArray {

	public static void main(String[] args) {
		String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            System.out.println("The normal String is : " + input);
            System.out.println("The Reversed String is : ");
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

	}

}
