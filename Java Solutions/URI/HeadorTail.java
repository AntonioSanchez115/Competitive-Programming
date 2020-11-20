import java.io.*;

public class HeadorTail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j, m;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            j = 0;
            m = 0;
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(s[i]);
                if (x == 1) {
                    j++;
                } else {
                    m++;
                }
            }
            System.out.println("Mary won " + m + " times and John won " + j + " times");
        }
    }

}
