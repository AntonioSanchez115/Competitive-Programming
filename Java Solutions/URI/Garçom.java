import java.io.*;

public class Garçom {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, l, c, copas = 0;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            l = Integer.parseInt(s[0]);
            c = Integer.parseInt(s[1]);
            copas += ((l > c) ? c : 0);
        }
        System.out.println(copas);
    }

}
