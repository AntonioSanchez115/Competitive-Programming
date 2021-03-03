
import java.io.*;

public class DifferentDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]), c = 0;
            for (int i = n; i <= m; i++) {
                int digits[] = new int[11], num = i;
                for (int j = 0; j < 11; j++) {
                    digits[j] = 0;
                }
                while (num > 0) {
                    digits[(num % 10)]++;
                    num /= 10;
                }
                Boolean rep = false;
                for (int j = 0; j < 11; j++) {
                    if (digits[j] > 1) {
                        rep = true;
                    }
                }
                if (!rep) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
