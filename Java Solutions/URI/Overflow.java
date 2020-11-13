import java.io.*;

public class Overflow {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, p, q;
        char c;
        n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        p = Integer.parseInt(s[0]);
        c = s[1].charAt(0);
        q = Integer.parseInt(s[2]);
        if (c == '+') {
            System.out.println(((p + q > n) ? "OVERFLOW" : "OK"));
        } else {
            System.out.println(((p * q > n) ? "OVERFLOW" : "OK"));
        }
    }

}
