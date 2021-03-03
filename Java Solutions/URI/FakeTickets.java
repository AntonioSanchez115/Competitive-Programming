
import java.io.*;

public class FakeTickets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), t;
            int m = Integer.parseInt(s[1]);
            if (n == 0) {
                break;
            }
            int ticket[] = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                ticket[i] = 0;
            }
            int duplicate = 0;
            s = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                t = Integer.parseInt(s[i]);
                ticket[t]++;
            }
            for (int i = 1; i <= n; i++) {
                if (ticket[i] > 1) {
                    duplicate++;
                }
            }
            System.out.println(duplicate);
        }
    }

}
