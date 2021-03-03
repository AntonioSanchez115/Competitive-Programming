
import java.io.*;

public class PascalLibrary {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            if (n + d == 0) break;
            int m[][] = new int[d][n];
            Boolean all = true;
            for (int i = 0; i < d; i++) {
                s = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    m[i][j] = Integer.parseInt(s[j]);
                }
            }
            for (int i = 0; i < n; i++) {
                all = true;
                for (int j = 0; j < d; j++) {
                    if (m[j][i] == 0) {
                        all = false;
                    }
                }
                if (all) {
                    break;
                }
            }
            System.out.println((all) ? "yes" : "no");
        }
    }

}
