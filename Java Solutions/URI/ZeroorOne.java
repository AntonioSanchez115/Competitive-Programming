import java.io.*;

public class ZeroorOne {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            if (a != b && a != c) {
                System.out.println("A");
            } else if (b != a && b != c) {
                System.out.println("B");
            } else if (c != a && c != b) {
                System.out.println("C");
            } else {
                System.out.println("*");
            }
        }
    }

}
