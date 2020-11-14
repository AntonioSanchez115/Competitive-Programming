import java.io.*;
import static java.lang.Integer.max;

public class DesafiodoMaiorNumero {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, nm = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            n = Integer.parseInt(s[i]);
            if (n == 0) {
                break;
            }
            nm = max(n, nm);
        }
        System.out.println(nm);
    }

}
