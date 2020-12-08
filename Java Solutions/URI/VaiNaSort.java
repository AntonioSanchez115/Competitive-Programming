import java.io.*;
import static java.util.Arrays.sort;

public class VaiNaSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int ordvec[] = new int[n];
            int vec[] = new int[n];
            int att = 0;
            Boolean order = false;
            while (!order) {
                int x;
                String s[] = br.readLine().split(" ");
                for (int i = 0; i < n; i++) {
                    vec[i] = Integer.parseInt(s[i]);
                    ordvec[i] = vec[i];
                }
                sort(ordvec);
                for (x = 0; x < n; x++) {
                    if (ordvec[x] != vec[x]) {
                        break;
                    }
                }
                if (x == n) {
                    order = true;
                }
                att++;
            }
            System.out.println(att);
        }
    }

}
