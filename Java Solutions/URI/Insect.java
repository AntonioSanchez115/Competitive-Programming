import java.io.*;

public class Insect {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x;
        n = Integer.parseInt(br.readLine());
        while ((n--) > 0) {
            x = Integer.parseInt(br.readLine());
            System.out.println(((x > 8000) ? "Mais de 8000!" : "Inseto!"));
        }
    }

}
