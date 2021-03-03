
import java.io.*;
import static java.lang.Integer.*;

public class Corrida1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), fastest = MAX_VALUE;
        int m = Integer.parseInt(s[1]), pos = 0;
        int mat[][] = new int[n][m];
        int time[] = new int[n];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                mat[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                time[i] += mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            if (time[i] < fastest) {
                fastest = time[i];
                pos = i;
            }
        }
        System.out.println(pos + 1);
    }
}
