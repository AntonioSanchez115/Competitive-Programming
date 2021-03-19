import java.io.*;

public class SedexMarciano {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double L, A, P, R;
        String s[] = br.readLine().split(" ");
        L = Double.parseDouble(s[0]);
        A = Double.parseDouble(s[1]);
        P = Double.parseDouble(s[2]);
        R = Double.parseDouble(s[3]);
        System.out.println((((Math.sqrt((Math.pow(L, 2)) + (Math.pow(A, 2)) + (Math.pow(P, 2)))) <= (R * 2)) ? "S" : "N"));
    }

}
