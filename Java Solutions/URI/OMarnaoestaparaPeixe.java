import java.io.*;

public class OMarnaoestaparaPeixe {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sea[][] = new int[101][101];
        int n, m, area = 0, t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s[] = br.readLine().split(" ");
            int xi = Integer.parseInt(s[0]);
            int xf = Integer.parseInt(s[1]);
            int yi = Integer.parseInt(s[2]);
            int yf = Integer.parseInt(s[3]);
            n = xf - xi;
            m = yf - yi;
            for (int i = xi; i < xi + n; i++) {
                for (int j = yi; j < yi + m; j++) {
                    sea[i][j] = 1;
                }
            }

            t--;
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (sea[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }

}
