import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		while (testcases > 0) {
			int begin = scanner.nextInt();
			int end = scanner.nextInt();
			System.out.printf("Case %d: %d\n", count++, IntStream.rangeClosed(begin, end).filter(e -> e%2 != 0).sum());
			testcases--;
		}
		scanner.close();
	}

}
