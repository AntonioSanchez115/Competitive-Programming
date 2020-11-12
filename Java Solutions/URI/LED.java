
import java.io.*;

public class LED {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int L = 0;
            String v = br.readLine();
            for (int i = 0; i < v.length(); i++) {
                int n = Integer.parseInt(v.substring(i, i + 1));
                if (n == 1) {
                    L += 2;
                }
                if (n == 7) {
                    L += 3;
                }
                if (n == 4) {
                    L += 4;
                }
                if (n == 2 || n == 3 || n == 5) {
                    L += 5;
                }
                if (n == 0 || n == 6 || n == 9) {
                    L += 6;
                }
                if (n == 8) {
                    L += 7;
                }
            }
            System.out.println(L + " leds");
            t--;
        }
    }

}
