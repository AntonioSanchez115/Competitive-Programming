import java.io.*;

public class MirrorSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), a, b;
        String str, s[];
        while (t > 0) {
            str = "";
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            for (int i = a; i <= b; i++) {
                str += Integer.toString(i);
            }
            System.out.print(str);
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
            t--;
        }
    }

}
