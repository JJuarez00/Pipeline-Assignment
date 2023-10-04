
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Who are you: ");
		String user = input.next();
		System.out.println("Hello, " + user + " !");
	}
}