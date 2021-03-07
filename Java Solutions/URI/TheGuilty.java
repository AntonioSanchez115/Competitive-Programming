import java.io.*;

public class TheGuilty {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine()), k;
            if (n == 0) {
                break;
            }
            int vec[] = new int[n + 1];
            String s[] = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                vec[i] = Integer.parseInt(s[i - 1]);
            }
            k = Integer.parseInt(br.readLine());
            while (vec[k] != k) {
                k = vec[k];
            }
            System.out.println(k);
        }
    }
}
