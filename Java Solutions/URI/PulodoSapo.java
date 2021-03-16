import java.io.*;

public class PulodoSapo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, p, d;
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        Boolean stone[] = new Boolean[n];
        for (int i = 0; i < n; i++) {
            stone[i] = false;
        }
        for (int i = 0; i < m; i++) {
            s = br.readLine().split(" ");
            p = Integer.parseInt(s[0]);
            d = Integer.parseInt(s[1]);
            for (int j = p - 1; j >= 0; j -= d) {
                stone[j] = true;
            }
            for (int j = p - 1; j < n; j += d) {
                stone[j] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println((stone[i]) ? "1" : "0");
        }
    }

}
