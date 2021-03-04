import java.io.*;

public class FrequentAskedQuestions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            if (n + k == 0) {
                break;
            }
            int vec[] = new int[n], maxn = 0, c = 0;
            s = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                vec[i] = Integer.parseInt(s[i]);
                maxn = Math.max(maxn, vec[i]);
            }
            int nums[] = new int[maxn];
            for (int i = 0; i < maxn; i++) {
                nums[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                nums[vec[i] - 1]++;
            }
            for (int i = 0; i < maxn; i++) {
                if (nums[i] >= k) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }

}
