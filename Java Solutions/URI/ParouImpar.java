import java.io.*;

public class ParouImpar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1, n;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String n1, n2;
            int a, b;
            n1 = br.readLine();
            n2 = br.readLine();
            System.out.println("Teste " + (t++));
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                a = Integer.parseInt(s[0]);
                b = Integer.parseInt(s[1]);
                System.out.println((((a + b) % 2 != 0) ? n2 : n1));
            }
            System.out.println("");
        }
    }

}
