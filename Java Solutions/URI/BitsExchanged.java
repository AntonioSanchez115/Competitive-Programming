import java.io.*;

public class BitsExchanged {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int notes[] = {50, 10, 5, 1};
            int num[] = new int[4];
            int i = 0;
            while (n > 0) {
                while (n >= notes[i]) {
                    num[i]++;
                    n -= notes[i];
                }
                i++;
            }
            System.out.print("Teste " + (t++) + "\n" + num[0]);
            for (i = 1; i < 4; i++) {
                System.out.print(" " + num[i]);
            }
            System.out.println("\n");
        }
    }

}
