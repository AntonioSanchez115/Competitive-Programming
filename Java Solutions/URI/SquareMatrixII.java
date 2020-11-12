
import java.io.*;

public class SquareMatrixII {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int M[][] = new int[n][n];
            Boolean flag1 = true, flag2 = true, flag3 = true;
            int num = n, t = 1, a = 0, b = n - 1;
            for (int i = 0; i < (2 * n - 1); i++) {
                if (num == 1) {
                    flag3 = false;
                }
                if (a == b) {
                    flag1 = false;
                }
                int x = a, y = b;
                if (flag1) {
                    b--;
                } else {
                    a++;
                }
                if (t == n) {
                    flag2 = false;
                }
                for (int j = 0; j < t; j++) {
                    M[x++][y++] = num;
                }
                if (flag3) {
                    num--;
                } else {
                    num++;
                }
                if (flag2) {
                    t++;
                } else {
                    t--;
                }
            }
            for (int i = 0; i < n; i++) {
                if (M[i][0] < 10) {
                    System.out.print("  " + M[i][0]);
                } else if (M[i][0] < 100) {
                    System.out.print(" " + M[i][0]);
                } else {
                    System.out.print(M[i][0]);
                }
                for (int j = 1; j < n; j++) {
                    if (M[i][j] < 10) {
                        System.out.print("   " + M[i][j]);
                    } else if (M[i][j] < 100) {
                        System.out.print("  " + M[i][j]);
                    } else {
                        System.out.print(" " + M[i][j]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
