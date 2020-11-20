import java.io.*;

public class PuttingPlatesontheTuktuks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s[] = br.readLine().split(" ");
            int a = 1, b = 1;
            long c = Long.parseLong(s[0]);
            long d = Long.parseLong(s[1]);
            for (int i = 0; i < c; i++) {
                a *= 26;
            }
            for (int i = 0; i < d; i++) {
                b *= 10;
            }
            System.out.println(((c + d == 0) ? 0 : (a * b)));
            t--;
        }
    }

}
