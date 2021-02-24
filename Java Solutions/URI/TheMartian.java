import java.io.*;

public class TheMartian {

    static int hexToDec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), a;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a = hexToDec(s[i]);
            System.out.printf("%c", a);
        }
        System.out.println("");
    }

}
