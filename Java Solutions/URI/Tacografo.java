import java.io.*;

public class Tacografo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String s[] = br.readLine().split(" ");
            int t = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);
            sum += (t * v);
            n--;
        }
        System.out.println(sum);
    }

}
