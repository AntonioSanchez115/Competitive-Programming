import java.io.*;

public class DesvendandoMontyHall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, c = 0;
        int t = Integer.parseInt(br.readLine());
        while ((t--) > 0) {
            x = Integer.parseInt(br.readLine());
            if (x != 1) {
                c++;
            }
        }
        System.out.println(c);
    }

}
