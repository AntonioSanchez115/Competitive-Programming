import java.io.*;

public class SomadeFracoes {

    static int __gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int D = 0, x = 0, y = 0;
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);
        D = __gcd(a, b);
        a = a / D;
        b = b / D;
        D = __gcd(c, d);
        c = c / D;
        d = d / D;
        x = (a * d) + (b * c);
        y = b * d;
        D = __gcd(x, y);
        x = x / D;
        y = y / D;
        System.out.println(x + " " + y);
    }

}
