import java.io.*;

public class Chocolate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, sum = 0, x;
        n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(s[i]);
            sum += x;
        }
        System.out.println(sum - n);
    }

}
