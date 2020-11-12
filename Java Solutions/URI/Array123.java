
import java.io.*;

public class Array123 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int m[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        m[i][j] = 2;
                    } else if (i == j) {
                        m[i][j] = 1;
                    } else {
                        m[i][j] = 3;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println("");
            }
        }
    }

}
