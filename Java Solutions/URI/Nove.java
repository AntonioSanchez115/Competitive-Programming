import java.io.*;

public class Nove {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n;
        while (t > 0) {
            n = Integer.parseInt(br.readLine());
            System.out.println((n % 2 == 0) ? "1" : "9");
            t--;
        }
    }

}
