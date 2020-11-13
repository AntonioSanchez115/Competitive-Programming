import java.io.*;

public class Tirateima {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        System.out.println((((x >= 0 && x <= 432) && (y >= 0 && y <= 468)) ? "dentro" : "fora"));
    }

}
