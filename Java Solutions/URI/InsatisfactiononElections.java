import java.io.*;

public class InsatisfactiononElections {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int n, m, x, w = -1;
            String s[] = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            int cand[] = new int[n + 1];
            //for (int i = 0; i < n + 1; i++) cand[i] = 0;
            s = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                x = Integer.parseInt(s[i]);
                cand[x]++;
            }
            for (int i = 1; i < n + 1; i++) {
                if (cand[i] > m / 2.0) {
                    w = i;
                }
            }
            System.out.println(w);
            t--;
        }
    }

}
