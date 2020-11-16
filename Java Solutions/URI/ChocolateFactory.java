import java.io.*;

public class ChocolateFactory {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double c = Double.parseDouble(s[2]);
            if (a + b + c == 0) {
                break;
            }
            System.out.println((int) Math.cbrt(a * b * c));
        }
    }
    
}
