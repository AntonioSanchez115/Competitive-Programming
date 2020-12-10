import java.io.*;

public class DetectiveWatson {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int susp[] = new int[n];
            int M = 0, index = -1;
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                susp[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i < n; i++) {
                if (susp[i] > M) {
                    M = susp[i];
                    index = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i == index) {
                    susp[i] = 0;
                }
            }
            M = 0;
            index = -1;
            for (int i = 0; i < n; i++) {
                if (susp[i] > M) {
                    M = susp[i];
                    index = i;
                }
            }
            System.out.println(index + 1);
        }
    }

}
