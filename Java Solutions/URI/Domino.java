import java.io.*;

public class Domino {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.println(((n + 1) * (n + 2)) / 2);
    }

}
