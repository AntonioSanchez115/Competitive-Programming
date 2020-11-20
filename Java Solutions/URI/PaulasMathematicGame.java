import java.io.*;

public class PaulasMathematicGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String str = br.readLine();
            if (str.charAt(0) == str.charAt(2)) {
                System.out.println((str.charAt(0) - '0') * (str.charAt(2) - '0'));
            } else {
                if (str.charAt(1) >= 'A' && str.charAt(1) <= 'Z') {
                    System.out.println((str.charAt(2) - '0') - (str.charAt(0) - '0'));
                } else {
                    System.out.println((str.charAt(2) - '0') + (str.charAt(0) - '0'));
                }                
            }
            n--;
        }
    }
}
