import java.io.*;

public class Internship {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, t = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int code[] = new int[n], ave[] = new int[n], h = 0;
            String s[];
            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                code[i] = Integer.parseInt(s[0]);
                ave[i] = Integer.parseInt(s[1]);
                if (ave[i] > h) {
                    h = ave[i];
                }
            }
            System.out.println("Turma " + (t++));
            for (int i = 0; i < n; i++) {
                if (ave[i] == h) {
                    System.out.print(code[i] + " ");
                }
            }
            System.out.println("\n");
        }
    }

}
