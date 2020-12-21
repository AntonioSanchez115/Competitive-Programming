import java.io.*;

public class Consecutivos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 1, maxCount = 0;
        int n = Integer.parseInt(br.readLine());
        int vec[] = new int[n];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            if (vec[i] == vec[i + 1]) {
                c++;
            } else {
                maxCount = Math.max(c, maxCount);
                c = 1;
            }
        }
        maxCount = Math.max(c, maxCount);
        System.out.println(maxCount);
    }

}
