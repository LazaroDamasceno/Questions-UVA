import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int dataSet = scanner.nextInt();
        double[] ammount = new double[12];
        while (dataSet > 0) {
            for (int i = 0; i < 12; i++) {
                ammount[i] = scanner.nextDouble();
            }
            double sum = DoubleStream.of(ammount).sum();
            double answer = sum / 12.0;
            DecimalFormat formatter = new DecimalFormat("#,###.00");
            System.out.println(counter++ + " $" + formatter.format(answer));
            dataSet--;
        }
        scanner.close();
    }
}
