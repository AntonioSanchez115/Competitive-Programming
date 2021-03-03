
import java.io.*;

public class EscadaRolante {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a = 0, b = 0, time = 0;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                a = Integer.parseInt(br.readLine());
            } else {
                b = Integer.parseInt(br.readLine());
                if (b - a > 9) {
                    time += 10;
                } else {
                    time += b - a;
                }
                a = b;
            }
        }
        time += 10;
        System.out.println(time);
    }

}
