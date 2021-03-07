import java.io.*;

public class FrotadeTaxi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        double a = Double.parseDouble(s[0]);
        double g = Double.parseDouble(s[1]);
        double ra = Double.parseDouble(s[2]);
        double rg = Double.parseDouble(s[3]);
        if (a == g && ra == rg) {
            System.out.println("G");
        } else if (a == g) {
            System.out.println(((ra > rg) ? "A" : "G"));
        } else if (ra == rg) {
            System.out.println(((a < g) ? "A" : "G"));
        } else {
            System.out.println((((ra / a) > (rg / g)) ? "A" : "G"));
        }
    }

}
