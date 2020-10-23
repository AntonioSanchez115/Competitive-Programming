import java.io.*;

public class DivisionofNlogonia {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int k = Integer.parseInt(br.readLine());
            if (k == 0) {
                break;
            }
            String s[];
            s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            for (int i = 0; i < k; i++) {
                s = br.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                if (x == n || y == m) {
                    System.out.println("divisa");
                } else if (x > n && y > m) {
                    System.out.println("NE");
                } else if (x > n && y < m) {
                    System.out.println("SE");
                } else if (x < n && y > m) {
                    System.out.println("NO");
                } else {
                    System.out.println("SO");
                }
            }
        }
    }

}
