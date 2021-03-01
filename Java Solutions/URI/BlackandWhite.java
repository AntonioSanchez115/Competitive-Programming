
import java.io.*;

public class BlackandWhite {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int mov = 0;
            String str[] = br.readLine().split(" ");
            String s = str[0], t = str[1], match = "";
            if (s.equals("*")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                match += ((s.charAt(i) == t.charAt(i)) ? "1" : "0");
            }
            String x[] = match.split("1");
            for (String p : x) {
                if (p.length() > 0) {
                    mov++;
                }
            }
            System.out.println(mov);
        }
    }

}
