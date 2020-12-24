import java.io.*;

public class GuessWhat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String str[] = br.readLine().split(" ");
            int q = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);
            int pos = 0, w = 101;
            str = br.readLine().split(" ");
            for (int i = 0; i < q; i++) {
                int x = Integer.parseInt(str[i]);
                x = Math.abs(s - x);
                if (x < w) {
                    w = x;
                    pos = i + 1;
                }
            }
            System.out.println(pos);
            t--;
        }
    }

}
