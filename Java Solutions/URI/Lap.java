
import java.io.*;

public class Lap {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int x1 = x, y1 = y, c = 1;
            while (y1 - x1 < y) {
                x1 += x;
                y1 += y;
                c++;
            }
            System.out.println(c);
        }
    }
}
