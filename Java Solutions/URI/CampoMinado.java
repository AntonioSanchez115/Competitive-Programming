import java.io.*;

public class CampoMinado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m[] = new int[n];
        Boolean b[] = new Boolean[n];
        for (int i = 0; i < n; i++) {
            m[i] = 0;
            int x = Integer.parseInt(br.readLine());
            b[i] = (x == 1);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (b[i]) {
                    m[i]++;
                }
                if (n!=1 && b[i + 1]) {
                    m[i]++;
                }
            } else if (i == n - 1) {
                if (b[i]) {
                    m[i]++;
                }
                if (b[i - 1]) {
                    m[i]++;
                }
            } else {
                if (b[i - 1]) {
                    m[i]++;
                }
                if (b[i]) {
                    m[i]++;
                }
                if (b[i + 1]) {
                    m[i]++;
                }
            }
        }
        for(int i=0;i<n;i++) System.out.println(m[i]);
    }

}
