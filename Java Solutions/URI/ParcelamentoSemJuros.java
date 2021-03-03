
import java.io.*;

public class ParcelamentoSemJuros {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine()), p = Integer.parseInt(br.readLine());
        if (v % p == 0) {
            for (int i = 0; i < p; i++) {
                System.out.println((int) (v / p));
            }
        } else {
            for (int i = 0; i < (v % p); i++) {
                System.out.println((int) (Math.ceil((double) v / (double) p)));
            }
            for (int i = 0; i < p - (v % p); i++) {
                System.out.println((int) (Math.floor((double) v / (double) p)));
            }
        }
    }

}
