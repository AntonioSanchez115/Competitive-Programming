
import java.io.*;

public class ParesdeNumeros {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), I = Integer.parseInt(s[1]), F = Integer.parseInt(s[2]);
        int vec[] = new int[n], c = 0;
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] + vec[j] >= I && vec[i] + vec[j] <= F) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

}
