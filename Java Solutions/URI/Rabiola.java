import java.io.*;

public class Rabiola {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vine;
        while ((vine = br.readLine()) != null) {
            int largest = 0;
            String s[] = vine.split("x");
            for (int i = 0; i < s.length; i++) {
                int n = s[i].length();
                if (i == 0 || i == s.length - 1) {
                    largest = Math.max(largest, n);
                } else {
                    n /= 2;
                    largest = Math.max(largest, n);
                }
            }
            System.out.println(largest);
        }
    }

}
