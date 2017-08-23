import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofTwoNos {
	public static void main(String[] args) {
		try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));          
            System.out.print("Enter 1st number: "); 
            String number1 = reader.readLine();
            int data1 = Integer.parseInt(number1);
            System.out.print("Enter 2nd number: "); 
            String number2 = reader.readLine();
            int data2 = Integer.parseInt(number2);
            System.out.println("The sum of two numbers is : "+ (data1+data2));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
	}
	
}
