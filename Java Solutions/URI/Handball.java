import java.io.*;

public class Handball {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int p = 0;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            Boolean success = true;
            for (int j = 0; j < m; j++) {
                int x = Integer.parseInt(s[j]);
                if (x == 0) {
                    success = false;
                }
            }
            if (success) {
                p++;
            }
        }
        System.out.println(p);
    }

}
