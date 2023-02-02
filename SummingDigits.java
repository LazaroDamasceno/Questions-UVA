import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        while (true) {
            Integer number = data.nextInt();
            if (number.equals(0)) {
                break;
            }
            while (number >= 10) {
                int sumOfDigits = Arrays
                        .stream(number.toString().split(""))
                        .mapToInt(e -> Integer.parseInt(e))
                        .sum();
                number = sumOfDigits;
            }
            System.out.println(number);
        }
        data.close();
    }
}

// class Solution {}
