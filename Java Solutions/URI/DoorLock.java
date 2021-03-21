import java.io.*;

public class DoorLock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, a = 0;
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        int vec[] = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            if (vec[i] != m) {
                a += Math.abs(m - vec[i]);
                if (m > vec[i]) {
                    vec[i + 1] += Math.abs(m - vec[i]);
                    vec[i] += Math.abs(m - vec[i]);
                } else {
                    vec[i + 1] -= Math.abs(m - vec[i]);
                    vec[i] -= Math.abs(m - vec[i]);
                }
            }
        }
        System.out.println(a);
    }

}
