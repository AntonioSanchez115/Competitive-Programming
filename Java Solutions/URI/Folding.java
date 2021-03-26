import java.io.*;

public class Folding {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n, t = 1;
        while (true) {
            n = Long.parseLong(br.readLine());
            if (n < 0) {
                break;
            }
            long acum = 2, exp = 1;
            for (int i = 0; i < n; i++) {
                acum += exp;
                exp *= 2;
            }
            System.out.println("Teste " + (t++) + "\n" + (acum * acum) + "\n");
        }
    }

}
