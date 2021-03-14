import java.io.*;

public class HameKameKa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int c, a, b, i;
        c = Integer.parseInt(br.readLine());
        while (c > 0) {
            a = 0;
            b = 0;
            i = 0;
            str = br.readLine();
            while (str.charAt(i) != 'm') {
                if (str.charAt(i++) == 'a') {
                    a++;
                }
            }
            while (i < str.length()) {
                if (str.charAt(i++) == 'a') {
                    b++;
                }
            }
            System.out.print("k");
            for (int x = 0; x < (a * b); x++) {
                System.out.print("a");
            }
            System.out.println("");
            c--;
        }
    }

}
