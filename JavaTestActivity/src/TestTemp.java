import java.util.Scanner;

public class TestTemp {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    String[] numbers = new String[5];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.next();
	    }
	    System.out.print("sdfsdf"+numbers[0]);
	}
}
