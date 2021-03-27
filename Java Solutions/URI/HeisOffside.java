import java.io.*;
import static java.lang.Integer.MAX_VALUE;
import static java.util.Arrays.sort;

public class HeisOffside {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, d;
        while (true) {
            String s[] = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            d = Integer.parseInt(s[1]);
            if (a + d == 0) {
                break;
            }
            int def[] = new int[d], Amin = MAX_VALUE, ax;
            s = br.readLine().split(" ");
            for (int i = 0; i < a; i++) {
                ax = Integer.parseInt(s[i]);
                if (ax < Amin) {
                    Amin = ax;
                }
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < d; i++) {
                def[i] = Integer.parseInt(s[i]);
            }
            sort(def);
            System.out.println(((def[1] <= Amin) ? "N" : "Y"));
        }
    }

}
