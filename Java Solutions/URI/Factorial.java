import java.io.*;

public class Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0, k = 0;
        int fact[] = {40320, 5040, 720, 120, 24, 6, 2, 1};
        int n = Integer.parseInt(br.readLine());
        while (sum < n) {
            while (fact[i] + sum <= n) {
                sum += fact[i];
                k++;
            }
            i++;
        }
        System.out.println(k);
    }

}
