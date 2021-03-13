import java.io.*;

public class Jetiqui {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), i1, i2, i;
        String s1, s2, str;
        while (t > 0) {
            s1 = br.readLine();
            s2 = br.readLine();
            str = br.readLine();
            i = 0;
            i1 = -1;
            i2 = -1;
            while (i1 == -1) {
                if (str.charAt(i++) == '_') {
                    i1 = i - 1;
                }
            }
            while (i2 == -1) {
                if (str.charAt(i++) == '_') {
                    i2 = i - 1;
                }
            }
            System.out.println((((s1.charAt(i1) == s2.charAt(i2)) || (s2.charAt(i1) == s1.charAt(i2)) || (s1.charAt(i1) == s1.charAt(i2)) || (s2.charAt(i1) == s2.charAt(i2))) ? "Y" : "N"));
            t--;
        }
    }

}
