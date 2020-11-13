import java.io.*;

public class Corrida {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int c = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        System.out.println(c % n);
    }

}
