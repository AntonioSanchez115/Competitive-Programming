import java.io.*;
import java.util.Arrays;

public class DeskUpdates {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0, aux;
        int n = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        int E[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            E[i] = i;
        }
        for (int i = 0; i < q; i++) {
            String s[] = br.readLine().split(" ");
            int e = Integer.parseInt(s[0]);
            if (e == 1) {
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                for (int j = 1; j <= n; j++) {
                    if (E[j] == a) {
                        x = j;
                    }
                }
                for (int j = 1; j <= n; j++) {
                    if (E[j] == b) {
                        y = j;
                    }
                }
                aux = E[x];
                E[x] = E[y];
                E[y] = aux;
            } else {
                int a = Integer.parseInt(s[1]);
                int cont = 0, j = a;
                while (E[j] != a) {
                    j = E[j];
                    cont++;
                }
                System.out.println(cont);
            }
        }
    }

}
