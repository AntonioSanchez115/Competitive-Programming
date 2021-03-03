
import java.io.*;

public class WhereAreMyKeys {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int q = Integer.parseInt(s[0]), e = Integer.parseInt(s[1]), x;
        int E[] = new int[q * 2];
        s = br.readLine().split(" ");
        for (int i = 0; i < e; i++) {
            E[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < q; i++) {
            x = Integer.parseInt(br.readLine());
            Boolean visited = false;
            for (int j = 0; j < e; j++) {
                if (x == E[j]) {
                    visited = true;
                    break;
                }
            }
            if (visited) {
                System.out.println("0");
            } else {
                System.out.println("1");
                E[e++] = x;
            }
        }
    }

}
