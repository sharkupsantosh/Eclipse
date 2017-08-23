import java.io.Console;

public class ConsoleInputReader {
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.out.println("No console: not in interactive mode!");
			System.exit(0);
		}

		System.out.print("Enter your Name: ");
		String name = console.readLine();
		
		System.out.println("Your username is: " + name);
		}

}
