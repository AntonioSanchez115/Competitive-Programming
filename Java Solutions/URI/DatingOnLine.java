import java.io.*;
import static java.util.Arrays.sort;

public class DatingOnLine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, total = 0.0, area;
        int cont = 1;
        int n = Integer.parseInt(br.readLine());
        double s[] = new double[(int) n];
        double vec[] = new double[(int) n];
        String str[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Double.parseDouble(str[i]);
        }
        sort(vec);
        if ((int) n % 2 != 0) {
            int x = 0;
            for (int i = 0; i <= n; i += 2) {
                s[x++] = vec[i];
            }
            for (int i = n - 2; i >= 0; i -= 2) {
                s[x++] = vec[i];
            }
        } else {
            int x = 1;
            s[0] = vec[0];
            for (int i = 1; i <= n; i += 2) {
                s[x++] = vec[i];
            }
            for (int i = n - 2; i >= 2; i -= 2) {
                s[x++] = vec[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                a = s[i];
                b = s[i + 1];
            } else {
                a = s[(int) n - 1];
                b = s[0];
            }
            area = ((b * a) * Math.sin((360.0 / n) * Math.PI / 180.0)) / 2.0;
            total += area;
        }
        System.out.printf("%.3f\n", total);
    }

}
