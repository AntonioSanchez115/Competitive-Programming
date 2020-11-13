
import java.io.*;

public class Gangorra {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int p1 = Integer.parseInt(s[0]);
        int c1 = Integer.parseInt(s[1]);
        int p2 = Integer.parseInt(s[2]);
        int c2 = Integer.parseInt(s[3]);
        if (p1 * c1 == p2 * c2) {
            System.out.println("0");
        } else {
            System.out.println(((p1 * c1 > p2 * c2) ? "-1" : "1"));
        }
    }

}
