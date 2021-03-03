
import java.io.*;

public class GrandmaVitóriasPiggyBanks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, t = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            System.out.println("Teste " + (t++));
            int x, y, j = 0, z = 0;
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                x = Integer.parseInt(s[0]);
                y = Integer.parseInt(s[1]);
                j += x;
                z += y;
                System.out.println(j - z);
            }
            System.out.println("");
        }
    }

}
