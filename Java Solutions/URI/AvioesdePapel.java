import java.io.*;

public class AvioesdePapel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int c = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        int f = Integer.parseInt(s[2]);
        System.out.println(((c * f <= p) ? "S" : "N"));
    }

}
