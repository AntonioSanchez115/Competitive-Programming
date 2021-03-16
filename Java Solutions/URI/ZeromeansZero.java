import java.io.*;

public class ZeromeansZero {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a, b;
        String str, s[];
        while (true) {
            s = br.readLine().split(" ");
            a = Long.parseLong(s[0]);
            b = Long.parseLong(s[1]);
            if (a + b == 0) {
                break;
            }
            str = Long.toString(a + b);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0') {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println("");
        }
    }

}
