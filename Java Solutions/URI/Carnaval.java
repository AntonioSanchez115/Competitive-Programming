import java.io.*;

public class Carnaval {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double low = 1000000000.0, high = 0.0, sum = 0.0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            double x = Double.parseDouble(s[i]);
            low = Math.min(low, x);
            high = Math.max(high, x);
            sum += x;
        }
        System.out.printf("%.1f\n", sum - (low + high));
    }

}
