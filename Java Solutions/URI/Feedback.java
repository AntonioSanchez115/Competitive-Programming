
import java.io.*;

public class Feedback {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String n[] = {"Rolien", "Naej", "Elehcim", "Odranoel"};
        while (t > 0) {
            int k = Integer.parseInt(br.readLine());
            for (int i = 0; i < k; i++) {
                int f = Integer.parseInt(br.readLine());
                System.out.println(n[f - 1]);
            }
            t--;
        }
    }

}
