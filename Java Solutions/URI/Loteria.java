import java.io.*;

public class Loteria {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[6], c = 0;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            int x = Integer.parseInt(s[i]);
            for (int j = 0; j < 6; j++) {
                if (x == a[j]) {
                    c++;
                }
            }
        }
        if (c == 3) {
            System.out.println("terno");
        } else if (c == 4) {
            System.out.println("quadra");
        } else if (c == 5) {
            System.out.println("quina");
        } else if (c == 6) {
            System.out.println("sena");
        } else {
            System.out.println("azar");
        }
    }

}
