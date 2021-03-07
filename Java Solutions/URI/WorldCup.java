import java.io.*;

public class WorldCup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int t = Integer.parseInt(s[0]), n = Integer.parseInt(s[1]);
            if (t == 0) {
                break;
            }
            int c = 0, x;
            for (int i = 0; i < t; i++) {
                s = br.readLine().split(" ");
                x = Integer.parseInt(s[1]);
                c += x;
            }
            System.out.println((n * 3) - c);
        }
    }

}
