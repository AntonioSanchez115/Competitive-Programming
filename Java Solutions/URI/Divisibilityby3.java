import java.io.*;

public class Divisibilityby3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int sum = 0;
            n = Integer.parseInt(s[0]);
            str = s[1];
            for (int i = 0; i < n; i++) {
                sum += str.charAt(i) - '0';
            }
            System.out.print(sum + " ");
            System.out.println((sum % 3 == 0) ? "sim" : "nao");
        }
    }

}
