import java.io.*;
import static java.util.Arrays.sort;

public class Elevador {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b = 0;
        n = Integer.parseInt(br.readLine());
        int vec[] = new int[n];
        Boolean possible = true;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        sort(vec);
        for (int i = 0; i < n; i++) {
            a = vec[i];
            if (a - b > 8) {
                possible = false;
            }
            b = a;
        }
        System.out.println((possible) ? "S" : "N");
    }

}
