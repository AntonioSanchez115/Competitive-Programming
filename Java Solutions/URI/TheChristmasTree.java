import java.io.*;

public class TheChristmasTree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, h, d, g;
        String s[];
        n = Integer.parseInt(br.readLine());
        while ((n--) > 0) {
            s = br.readLine().split(" ");
            h = Integer.parseInt(s[0]);
            d = Integer.parseInt(s[1]);
            g = Integer.parseInt(s[2]);
            System.out.println((((h >= 200 && h <= 300) && (d >= 50) && (g >= 150)) ? "Sim" : "Nao"));
        }
    }

}
