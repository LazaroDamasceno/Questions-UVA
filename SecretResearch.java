import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while (testCases > 0) {
			String input = scanner.next();
			if (input.charAt(input.length()-2) == '3' && input.charAt(input.length()-1) == '5') {
				System.out.println("-");
			}
			else if (input.charAt(0) == '9' &&  input.charAt(input.length()-1) == '4') {
				System.out.println("*");
			}
			else if (input.charAt(0) == '1' && input.charAt(1) == '9' && input.charAt(2) == '0') {
				System.out.println("?");
			} 
			else {
				System.out.println("+");
			}
			testCases--;
		}
		scanner.close();
	}

}
