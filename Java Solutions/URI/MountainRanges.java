import java.io.*;

public class MountainRanges {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int t = 1, n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int a[] = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            int v = 1;
            for (int j = i; j < n - 1; j++) {
                if (a[j + 1] - a[j] > x) {
                    break;
                } else {
                    v++;
                }
            }
            t = Math.max(t, v);
        }
        System.out.println(t);
    }

}
