import java.io.*;

public class HelloGalaxy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String name = "";
            int first = 2114;
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                String str = s[0];
                int a = Integer.parseInt(s[1]);
                int t = Integer.parseInt(s[2]);
                if (a - t < first) {
                    first = a - t;
                    name = str;
                }
            }
            System.out.println(name);
        }
    }
}
