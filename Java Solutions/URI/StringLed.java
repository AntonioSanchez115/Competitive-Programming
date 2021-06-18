import java.io.*;

public class StringLed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, l, a, b, x = 0, sum = 0;
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        l = Integer.parseInt(s[1]);
        int arr[] = new int[n];
        for (int i = 0; i < l; i++) {
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            arr[a - 1]++;
            arr[b - 1]--;
        }
        while (x < n - 1) {
            sum += arr[x++];
            if (sum == 0) {
                break;
            }
        }
        System.out.println(((x == n - 1) ? "COMPLETO" : "INCOMPLETO"));
    }

}
