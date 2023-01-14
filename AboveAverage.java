import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner data = new Scanner(System.in);
		int testcases = data.nextInt();
		while (testcases > 0) {
			int students = data.nextInt();
			int[] grades = new int[students];
			for (int i = 0; i < students; i++) {
				grades[i] = data.nextInt();
			}
			int avgScore = (int)IntStream.of(grades).average().getAsDouble();
			int aboveAvgQtt = (int)IntStream.of(grades).filter(e -> e > avgScore).count();
			double aboveAvgPct = (aboveAvgQtt / (students * 1.0)) * 100;
			String formattedPct = String.format("%.3f", aboveAvgPct);
			System.out.println(formattedPct + "%");
			testcases--;
		}
	}

}
