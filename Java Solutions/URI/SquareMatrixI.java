
import java.io.*;

public class SquareMatrixI {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int M[][] = new int[n][n];
            int infLim = 0, supLim = n, cont = 1, t;
            if (n % 2 != 0) {
                t = n / 2 + 1;
            } else {
                t = n / 2;
            }
            for (int i = 0; i < t; i++) {
                for (int j = infLim; j < supLim; j++) {
                    for (int k = infLim; k < supLim; k++) {
                        M[j][k] = cont;
                    }
                }
                infLim++;
                supLim--;
                cont++;
            }
            for (int i = 0; i < n; i++) {
                System.out.print("  " + M[i][0]);
                for (int j = 1; j < n; j++) {
                    if (M[i][j] < 10) {
                        System.out.print("   " + M[i][j]);
                    } else {
                        System.out.print("  " + M[i][j]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
