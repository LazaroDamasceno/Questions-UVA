import java.util.*;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int adder = 0;
		int testCases = scanner.nextInt();
		while (testCases > 0) {
			String text = scanner.nextLine();
			if (text.contains("donate")) {
				adder += Integer.parseInt(text.split(" ")[1]);
			} else if (text.contains("report")) {
				System.out.println(adder);
			}
			testCases--;
		}
		scanner.close();
	}

}
