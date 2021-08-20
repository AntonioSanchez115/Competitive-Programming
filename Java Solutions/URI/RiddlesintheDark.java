import java.io.*;

public class RiddlesintheDark {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        System.out.printf("%.2f\n", 2.0 * 3.14 * r);
    }

}
