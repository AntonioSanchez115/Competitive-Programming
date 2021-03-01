import java.io.*;

public class SharingwithFink {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int a = 1, b = 0;
            while (a + b <= n) {
                b += a;
                a++;
            }
            System.out.println(b + " " + (n - b));
        }
    }

}
