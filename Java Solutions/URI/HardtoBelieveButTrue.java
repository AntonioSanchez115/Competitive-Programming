
import java.io.*;

public class HardtoBelieveButTrue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String equation = br.readLine();
            String sa = "", sb = "", sc = "";
            int i = equation.length() - 1;
            while (equation.charAt(i) != '=') {
                sc += equation.charAt(i--);
            }
            i--;
            while (equation.charAt(i) != '+') {
                sb += equation.charAt(i--);
            }
            i--;
            while (i >= 0) {
                sa += equation.charAt(i--);
            }
            long a = Long.parseLong(sa);
            long b = Long.parseLong(sb);
            long c = Long.parseLong(sc);
            System.out.println((a + b == c) ? "True" : "False");
            if (a + b == 0) {
                break;
            }
        }
    }

}
