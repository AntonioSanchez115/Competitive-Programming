import java.io.*;

public class Image {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, a, b;
        while (true) {
            String s[] = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            if (n + m == 0) {
                break;
            }
            char draw[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < m; j++) {
                    draw[i][j] = str.charAt(j);
                }
            }
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(draw[i / (a / n)][j / (b / m)]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
