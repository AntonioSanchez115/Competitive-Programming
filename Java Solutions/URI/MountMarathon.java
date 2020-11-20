import java.io.*;

public class MountMarathon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int card[] = new int[n];
        int pile = n;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(s[i]);
        }
        int i = n - 1;
        while (i > 0) {
            int cont = 0;
            while (i != 0 && card[i - 1] >= card[i]) {
                cont++;
                i--;
            }
            i--;
            pile -= cont;
        }
        System.out.println(pile);
    }

}
