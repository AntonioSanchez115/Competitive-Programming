import java.io.*;

public class VolumedaTV {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int v = Integer.parseInt(s[0]), t = Integer.parseInt(s[1]), x;
        s = br.readLine().split(" ");
        for (int i = 0; i < t; i++) {
            x = Integer.parseInt(s[i]);
            v += x;
            if (v > 100) {
                v = 100;
            }
            if (v < 0) {
                v = 0;
            }
        }
        System.out.println(v);
    }

}
