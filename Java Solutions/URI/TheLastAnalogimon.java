import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n, m;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            int M[][] = new int[n][m];
            int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    M[i][j] = Integer.parseInt(s[j]);
                    if (M[i][j] == 1) {
                        x1 = i;
                        x2 = j;
                    }
                    if (M[i][j] == 2) {
                        y1 = i;
                        y2 = j;
                    }
                }
            }

            System.out.println((Math.abs(x1 - y1)) + (Math.abs(x2 - y2)));

        }
    }
}
