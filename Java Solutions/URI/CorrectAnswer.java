import java.io.*;

public class CorrectAnswer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            x = Integer.parseInt(br.readLine());
            System.out.println("resposta " + i + ": " + x);
        }
    }

}
