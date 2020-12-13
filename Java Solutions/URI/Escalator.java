import java.io.*;

public class Escalator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int vec[] = new int[n];
            int time = 0;
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                vec[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i < n - 1; i++) {
                if (vec[i] + 10 >= vec[i + 1]) {
                    time += (vec[i + 1] - vec[i]);
                } else {
                    time += 10;
                }
            }
            time += 10;
            System.out.println(time);
        }
    }

}
