import java.io.*;

public class EnjoytheOffer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n, k, cont;
        String s[];
        while ((t--) > 0) {
            s = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            k = Integer.parseInt(s[1]);
            cont = 0;
            while (n >= k) {
                cont++;
                n -= k;
            }
            System.out.println(n + cont);
        }
    }

}
