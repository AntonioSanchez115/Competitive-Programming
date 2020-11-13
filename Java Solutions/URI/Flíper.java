import java.io.*;

public class Flíper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int p = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        if (p == 1) {
            System.out.println(((r == 1) ? "A" : "B"));
        } else {
            System.out.println("C");
        }
    }

}
