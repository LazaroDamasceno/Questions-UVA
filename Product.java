import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        while (data.hasNext()) {
            BigInteger X = data.nextBigInteger();
            BigInteger Y = data.nextBigInteger();
            System.out.println(X.multiply(Y));
        }
    }
}
