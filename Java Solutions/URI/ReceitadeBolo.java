import java.io.*;

public class ReceitadeBolo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        a /= 2;
        b /= 3;
        c /= 5;
        System.out.println(Math.min(Math.min(a, b), c));
    }

}
