import java.io.*;

public class CodingCompetition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), sum = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s[i]);
            while (x % 3 != 0) {
                x--;
            }
            sum += x;
        }
        System.out.println(sum);
    }

}
