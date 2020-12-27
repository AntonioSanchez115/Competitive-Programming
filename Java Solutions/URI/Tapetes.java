import java.io.*;

public class Tapetes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        long l = Long.parseLong(s[0]);
        long n = Long.parseLong(s[1]);
        System.out.println((l - (n - 1)) * (l - (n - 1)) + (n - 1));
    }

}
