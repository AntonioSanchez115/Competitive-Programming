import java.io.*;

public class SansasSnowCastle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), p = 0, v = 0;
        int k = Integer.parseInt(s[1]);
        int vec[] = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        Boolean up = true;
        for (int i = 1; i < n; i++) {
            if (up) {
                if (vec[i] < vec[i - 1]) {
                    p++;
                    up = false;
                }
            } else {
                if (vec[i] > vec[i - 1]) {
                    v++;
                    up = true;
                }
            }
        }
        System.out.println((p == k && v == k - 1) ? "beautiful" : "ugly");
    }

}
