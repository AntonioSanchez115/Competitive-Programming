import java.io.*;

public class ContadeAgua {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = 7, n = Integer.parseInt(br.readLine());
        if (n > 10 && n <= 30) {
            amount = 7 + (n - 10);
        }
        if (n > 30 && n <= 100) {
            amount = 27 + (n - 30) * 2;
        }
        if (n > 100) {
            amount = 167 + (n - 100) * 5;
        }
        System.out.println(amount);
    }

}
