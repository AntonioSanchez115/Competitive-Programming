import java.io.*;

public class TowersofHanoi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, t = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            System.out.println("Teste " + (t++) + "\n" + (((long) Math.pow(2, (double) n)) - 1) + "\n");
        }
    }

}
