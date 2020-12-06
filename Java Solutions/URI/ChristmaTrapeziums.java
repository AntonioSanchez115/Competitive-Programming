import java.io.*;

public class ChristmaTrapeziums {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int t = Integer.parseInt(br.readLine());
            if (t == 0) {
                break;
            }
            for (int i = 1; i <= t; i++) {
                String s[] = br.readLine().split(" ");
                double total = 0.0;
                int q = Integer.parseInt(s[0]);
                double a = Double.parseDouble(s[1]);
                double b = Double.parseDouble(s[2]);
                double area = (a + b) / 2.0 * 5.0;
                while (q > 0) {
                    total += area;
                    q--;
                }
                System.out.printf("Size #%d:\nIce Cream Used: %.2f cm2\n", i, total);
            }
            System.out.println("");
        }
    }

}
