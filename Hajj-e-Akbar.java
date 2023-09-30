import java.util.*;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("*")) break;
			else if (input.equals("Hajj")) {
				String answer = String.format("Case %d: Hajj-e-Akbar", counter++);
				System.out.println(answer);
			} else {
				String answer = String.format("Case %d: Hajj-e-Asghar", counter++);
				System.out.println(answer);
			}
		}
		scanner.close();
	}

}
