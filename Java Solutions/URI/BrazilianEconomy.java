import java.io.*;

public class BrazilianEconomy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ok = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(s[i]);
            if (v == 0) {
                ok++;
            }
        }
        System.out.println(((ok > (n - ok)) ? "Y" : "N"));
    }

}
