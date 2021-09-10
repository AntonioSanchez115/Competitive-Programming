import java.io.*;

public class ElectricalOutlets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k, x, c;
        String s[];
        n = Integer.parseInt(br.readLine());
        while ((n--) > 0) {
            c = 0;
            s = br.readLine().split(" ");
            k = Integer.parseInt(s[0]);
            for (int i = 1; i <= k; i++) {
                x = Integer.parseInt(s[i]);
                c += ((i != k - 1) ? x - 1 : x);
            }
            System.out.println(c);
        }
    }

}
