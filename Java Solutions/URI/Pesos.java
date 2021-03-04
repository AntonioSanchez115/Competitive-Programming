import java.io.*;

public class Pesos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a = 0, b;
        Boolean possible = true;
        n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            b = Integer.parseInt(s[i]);
            if (b - a > 8) {
                possible = false;
            }
            a = b;
        }
        System.out.println((possible) ? "S" : "N");
    }

}
