
import java.io.*;

public class SSN1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int vec[] = new int[11], x = 0, sum = 0;
            for (int i = 0; i < 14; i++) {
                if (str.charAt(i) != '.' && str.charAt(i) != '-') {
                    vec[x++] = str.charAt(i) - '0';
                }
            }
            Boolean b1 = false, b2 = false;
            for (int i = 1; i <= 9; i++) {
                sum += vec[i - 1] * i;
            }
            if (sum % 11 == 10) {
                if (vec[9] == 0) {
                    b1 = true;
                }
            } else {
                if (sum % 11 == vec[9]) {
                    b1 = true;
                }
            }
            sum = 0;
            for (int i = 9; i >= 1; i--) {
                sum += vec[9 - i] * i;
            }
            if (sum % 11 == 10) {
                if (vec[10] == 0) {
                    b2 = true;
                }
            } else {
                if (sum % 11 == vec[10]) {
                    b2 = true;
                }
            }
            System.out.println((b1 && b2) ? "CPF valido" : "CPF invalido");
        }
    }

}
