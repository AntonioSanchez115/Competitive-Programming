import java.io.*;

public class SSN2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int b1 = 0, b2 = 0;
            for (int i = 0; i < 9; i++) {
                System.out.print(str.charAt(i));
                if ((i + 1) % 3 == 0 && i != 8) {
                    System.out.print(".");
                }
            }
            System.out.print("-");
            for (int i = 1; i <= 9; i++) {
                b1 += (str.charAt(i - 1) - '0') * i;
            }
            System.out.print(((b1 % 11 != 10) ? (b1 % 11) : 0));
            for (int i = 9; i >= 1; i--) {
                b2 += (str.charAt(9 - i) - '0') * i;
            }
            System.out.println(((b2 % 11 != 10) ? (b2 % 11) : 0));
        }
    }

}
