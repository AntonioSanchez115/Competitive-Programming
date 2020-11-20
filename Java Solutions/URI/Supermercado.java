import java.io.*;

public class Supermercado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double lowest = 1000000000.0;
        double n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            lowest = Math.min(lowest, (a / b * 1000.0));
        }
        System.out.printf("%.2f\n", lowest);
    }

}
