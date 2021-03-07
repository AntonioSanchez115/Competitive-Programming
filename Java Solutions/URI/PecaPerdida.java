import java.io.*;

public class PecaPerdida {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), x, sum = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            x = Integer.parseInt(s[i]);
            sum += x;
        }
        System.out.println(((n * (n + 1)) / 2) - sum);
    }

}
