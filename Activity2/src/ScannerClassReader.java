import java.util.Scanner;

public class ScannerClassReader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Hello " + name);
	}

}
