import java.io.*;

public class PerfectChoir {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int vec[] = new int[n], sum = 0;
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                vec[i] = Integer.parseInt(s[i]);
                sum += vec[i];
            }
            if (sum % n != 0) {
                System.out.println("-1");
            } else {
                int higher = 0;
                sum = sum / n;
                for (int i = 0; i < n; i++) {
                    if (vec[i] > sum) {
                        higher += vec[i] - sum;
                    }
                }
                System.out.println(higher + 1);
            }
        }
    }

}
