import java.io.*;

public class Pedagio {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int l = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        System.out.println((k * l) + (p * (int) (l / d)));
    }

}
