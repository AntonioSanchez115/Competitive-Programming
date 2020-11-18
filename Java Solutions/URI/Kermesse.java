import java.io.*;

public class Kermesse {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true) {
            int winner = 0, n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int p = Integer.parseInt(s[i]);
                if (p == i + 1) {
                    winner = p;
                }
            }
            System.out.println("Teste " + (t++) + "\n" + winner + "\n");
        }
    }

}
