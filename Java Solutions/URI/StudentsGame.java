import java.io.*;

public class StudentsGame {

    static Boolean isPrime(long n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        long p1 = 0, p2 = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (i <= n) {
                    p1 = i;
                }
            }
        }
        for (int i = 2; i <= m; i++) {
            if (isPrime(i)) {
                if (i <= m) {
                    p2 = i;
                }
            }
        }
        System.out.println(p1 * p2);

    }

}
