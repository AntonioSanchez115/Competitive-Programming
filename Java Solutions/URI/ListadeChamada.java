
import java.io.*;
import java.util.Arrays;

public class ListadeChamada {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = br.readLine();
        }
        Arrays.sort(names);
        System.out.println(names[k - 1]);
    }

}
