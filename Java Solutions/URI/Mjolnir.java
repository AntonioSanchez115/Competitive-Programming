
import java.io.*;

public class Mjolnir {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        while (c > 0) {
            String s[] = br.readLine().split(" ");
            String name = s[0];
            int force = Integer.parseInt(s[1]);
            if (name.equals("Thor") && force >= 1) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
            c--;
        }
    }
}
