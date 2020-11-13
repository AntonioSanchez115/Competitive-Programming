import java.io.*;
import static java.lang.Math.ceil;

public class SearchingforNessy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            System.out.printf("%d\n", (long) (Math.ceil((n - 2) / (double) 3) * Math.ceil((m - 2) / (double) 3)));
            t--;
        }
    }

}
