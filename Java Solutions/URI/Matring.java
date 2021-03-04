import java.io.*;

public class Matring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double mat[][] = new double[4][83];
        String str = "";
        double exp;
        for (int i = 0; i < 4; i++) {
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                mat[i][j] = (double) str.charAt(j) - '0';
            }
        }
        int n = str.length();
        double F = 0, L = 0, M = 0;
        exp = 3;
        for (int i = 0; i < 4; i++) {
            F += mat[i][0] * Math.pow(10, exp--);
        }
        exp = 3;
        for (int i = 0; i < 4; i++) {
            L += mat[i][n - 1] * Math.pow(10, exp--);
        }
        for (int i = 1; i <= n - 2; i++) {
            M = 0;
            exp = 3;
            for (int j = 0; j < 4; j++) {
                M += mat[j][i] * Math.pow(10.0, exp--);
            }
            System.out.print((char) ((int) (F * M + L) % 257));
        }
        System.out.println("");
    }

}
