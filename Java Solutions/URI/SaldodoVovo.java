import java.io.*;

public class SaldodoVovo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S[] = br.readLine().split(" ");
        int n = Integer.parseInt(S[0]), s = Integer.parseInt(S[1]), m = 10000;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            s += x;
            m = Math.min(m, s);
        }
        System.out.println(m);
    }

}
