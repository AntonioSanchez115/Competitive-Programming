import java.io.*;

public class MusicalLoop {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int p = 0, n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int wave[] = new int[n];
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                wave[i] = Integer.parseInt(s[i]);
            }
            Boolean dir = ((wave[0] > wave[1]) ? false : true);
            if (dir) {
                if (wave[n - 1] > wave[0]) {
                    p++;
                }
            } else {
                if (wave[n - 1] < wave[0]) {
                    p++;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (dir) {
                    if (wave[i] > wave[i + 1]) {
                        p++;
                        dir = false;
                    }
                } else {
                    if (wave[i] < wave[i + 1]) {
                        p++;
                        dir = true;
                    }
                }
            }
            if (dir) {
                if (wave[n - 1] > wave[0]) {
                    p++;
                }
            } else {
                if (wave[n - 1] < wave[0]) {
                    p++;
                }
            }
            System.out.println(p);
        }
    }

}
