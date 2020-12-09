import java.io.*;

public class GuerraporTerritorio {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int vec[] = new int[n];
        int total = 0, sum = 0, x = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
            total += vec[i];
        }
        while (sum != total / 2) {
            sum += vec[x++];
        }
        System.out.println(x);
    }

}
