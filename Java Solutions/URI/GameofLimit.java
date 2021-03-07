import java.io.*;

public class GameofLimit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, t, l, a = 0, b = 0, x;
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        t = Integer.parseInt(s[1]);
        l = Integer.parseInt(s[2]);
        for (int i = 0; i < n - 1; i++) {
            x = Integer.parseInt(br.readLine());
            if (Math.abs(x - t) <= l) {
                if (i % 2 == 0) {
                    a += (Math.abs(x - t));
                } else {
                    b += (Math.abs(x - t));
                }
                t = x;
            }
        }
        System.out.println(a + " " + b);
    }

}
