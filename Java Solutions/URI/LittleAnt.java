
import java.io.*;

public class LittleAnt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n;
        while (t > 0) {
            n = Integer.parseInt(br.readLine());
            System.out.println((int) Math.ceil((double) n / 2));
            t--;
        }
    }

}
