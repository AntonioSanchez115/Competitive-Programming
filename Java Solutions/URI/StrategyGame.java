
import java.io.*;

public class StrategyGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q, r, x, idwin = 0, winner = 0, it = 0;
        String s[] = br.readLine().split(" ");
        q = Integer.parseInt(s[0]);
        r = Integer.parseInt(s[1]);
        int player[] = new int[q];
        s = br.readLine().split(" ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < q; j++) {
                x = Integer.parseInt(s[it++]);
                player[j] += x;
            }
        }
        for (int i = 0; i < q; i++) {
            if (player[i] >= winner) {
                winner = player[i];
                idwin = i + 1;
            }
        }
        System.out.println(idwin);
    }

}
