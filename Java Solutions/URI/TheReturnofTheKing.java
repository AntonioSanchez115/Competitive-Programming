import java.io.*;

public class TheReturnofTheKing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double sum = 0.0, n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                sum += s.charAt(i) - '0';
            } else {
                sum += 10;
                i--;
            }
            n++;
        }
        System.out.printf("%.2f\n", sum / n);
    }

}
