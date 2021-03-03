
import java.io.*;

public class Elevator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, c, s, e, cap = 0;
        String S[] = br.readLine().split(" ");
        n = Integer.parseInt(S[0]);
        c = Integer.parseInt(S[1]);
        Boolean overflow = false;
        for (int i = 0; i < n; i++) {
            S = br.readLine().split(" ");
            s = Integer.parseInt(S[0]);
            e = Integer.parseInt(S[1]);
            cap += (-s + e);
            if (cap > c) {
                overflow = true;
            }
        }
        System.out.println((overflow) ? "S" : "N");
    }

}
