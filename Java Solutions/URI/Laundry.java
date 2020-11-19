import java.io.*;

public class Laundry {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int la = Integer.parseInt(s[0]);
        int lb = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        int sa = Integer.parseInt(s[0]);
        int sb = Integer.parseInt(s[1]);
        System.out.println((((n >= la && n <= lb) && (n >= sa && n <= sb)) ? "possivel" : "impossivel"));
    }

}
