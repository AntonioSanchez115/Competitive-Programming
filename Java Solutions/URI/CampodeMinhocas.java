import java.io.*;

public class CampodeMinhocas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, higher = 0, sum = 0;
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        int M[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                M[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += M[i][j];
            }
            if (sum > higher) {
                higher = sum;
            }
        }
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += M[j][i];
            }
            if (sum > higher) {
                higher = sum;
            }
        }
        System.out.println(higher);
    }

}
