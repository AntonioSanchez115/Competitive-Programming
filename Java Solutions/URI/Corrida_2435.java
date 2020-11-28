import java.io.*;

public class Corrida_2435 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        double d1 = Double.parseDouble(s[1]);
        double v1 = Double.parseDouble(s[2]);
        s = br.readLine().split(" ");
        int n2 = Integer.parseInt(s[0]);
        double d2 = Double.parseDouble(s[1]);
        double v2 = Double.parseDouble(s[2]);
        System.out.println((((d1 / v1 * 60.0) >= (d2 / v2 * 60.0)) ? n2 : n1));
    }

}
