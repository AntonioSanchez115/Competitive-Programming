import java.io.*;

public class CopadoMundo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octavos = "ABCDEFGHIJKLMNOP", cuartos = "", semi = "", fin = "";
        int m, n;
        String s[];
        for (int i = 0; i < 16; i += 2) {
            s = br.readLine().split(" ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            cuartos += ((m > n) ? octavos.charAt(i) : octavos.charAt(i + 1));
        }
        for (int i = 0; i < 8; i += 2) {
            s = br.readLine().split(" ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            semi += ((m > n) ? cuartos.charAt(i) : cuartos.charAt(i + 1));
        }
        for (int i = 0; i < 4; i += 2) {
            s = br.readLine().split(" ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            fin += ((m > n) ? semi.charAt(i) : semi.charAt(i + 1));
        }
        s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        System.out.println(((m > n) ? fin.charAt(0) : fin.charAt(1)));
    }

}
