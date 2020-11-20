import java.io.*;
import static java.lang.Integer.MAX_VALUE;

public class Corrida_2396 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, c = 0, t = 3;
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int vec[] = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                x = Integer.parseInt(s[j]);
                sum += x;
            }
            vec[i] = sum;
        }
        while (t > 0) {
            x = MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (vec[i] < x) {
                    x = vec[i];
                    c = i + 1;
                }
            }
            vec[c - 1] = MAX_VALUE;
            System.out.println(c);
            t--;
        }

    }

}
