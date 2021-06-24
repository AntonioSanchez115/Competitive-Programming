import java.io.*;

public class NoelsWorkGroups {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, b = 0, a = 0, m = 0, d = 0, h, t = 0;
        String e, g;
        n = Integer.parseInt(br.readLine());
        while ((n--) > 0) {
            String s[] = br.readLine().split(" ");
            e = s[0];
            g = s[1];
            h = Integer.parseInt(s[2]);
            if (g.equals("bonecos")) {
                b += h;
            }
            if (g.equals("arquitetos")) {
                a += h;
            }
            if (g.equals("musicos")) {
                m += h;
            }
            if (g.equals("desenhistas")) {
                d += h;
            }
        }
        t += b / 8;
        t += a / 4;
        t += m / 6;
        t += d / 12;
        System.out.println(t);
    }

}
