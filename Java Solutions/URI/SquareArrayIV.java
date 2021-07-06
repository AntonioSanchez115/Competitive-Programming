import java.io.*;

public class SquareArrayIV {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str;
        while ((str = br.readLine()) != null) {
            int m[][] = new int[102][102];
            n = Integer.parseInt(str);
            int x = n / 3;
            for (int i = 0; i < n; i++) {
                m[i][i] = 2;
            }
            for (int i = n - 1, j = 0; i >= 0; i--, j++) {
                m[i][j] = 3;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i >= x && i < n - x) && (j >= x && j < n - x)) {
                        m[i][j] = 1;
                    }
                }
            }
            m[n / 2][n / 2] = 4;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
