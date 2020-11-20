import java.io.*;

public class Chocolate_2427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long p = 1;
        double L = Double.parseDouble(br.readLine());
        while (L >= 2.0) {
            L /= 2;
            p *= 4;
        }
        System.out.println(p);
    }

}
