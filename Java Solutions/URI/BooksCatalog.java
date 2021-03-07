import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class BooksCatalog {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p, x, n, sum = 0;
        Long vec[][] = new Long[5][11];
        PriorityQueue<Long> ans = new PriorityQueue<Long>(Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            String s[] = br.readLine().split(" ");
            vec[i][0] = Long.parseLong(s[0]);
            for (int j = 1; j <= vec[i][0]; j++) {
                x = Integer.parseInt(s[j]);
                vec[i][j] = (long) x;
            }
        }
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= vec[0][0]; i++) {
            for (int j = 1; j <= vec[1][0]; j++) {
                for (int k = 1; k <= vec[2][0]; k++) {
                    for (int l = 1; l <= vec[3][0]; l++) {
                        for (int m = 1; m <= vec[4][0]; m++) {
                            ans.add((vec[0][i] + vec[1][j] + vec[2][k] + vec[3][l] + vec[4][m]));
                        }
                    }
                }
            }
        }
        while (n > 0) {
            sum += ans.poll();
            n--;
        }
        System.out.println(sum);

    }

}
