import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int cases = 0;
		while (true) {
			String input = data.nextLine();
			if (input.equals("#")) { break; }
			System.out.printf("Case %d: ", ++cases);
			if (input.equals("HELLO")) { System.out.println("ENGLISH"); } 
			else if (input.equals("HOLA")) { System.out.println("SPANISH"); } 
			else if (input.equals("HALLO")) { System.out.println("GERMAN"); } 
			else if (input.equals("BONJOUR")) { System.out.println("FRENCH"); } 
			else if (input.equals("CIAO")) { System.out.println("ITALIAN"); } 
			else if (input.equals("ZDRAVSTVUJTE")) { System.out.println("RUSSIAN"); } 
			else { System.out.println("UNKNOWN"); }
		}
	}
}
