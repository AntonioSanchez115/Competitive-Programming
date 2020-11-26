import java.io.*;

public class Sedex {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        String s[] = br.readLine().split(" ");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[1]);
        double c = Double.parseDouble(s[2]);
        System.out.println((((r <= a) && (r <= b) && (r <= c)) ? "S" : "N"));
    }

}
