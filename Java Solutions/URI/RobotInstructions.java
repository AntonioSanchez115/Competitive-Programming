import java.io.*;

public class RobotInstructions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int p = 0, x;
            int n = Integer.parseInt(br.readLine());
            int ins[] = new int[n];
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                if (s[0].equals("LEFT")) {
                    ins[i] = 200;
                } else if (s[0].equals("RIGHT")) {
                    ins[i] = 300;
                } else {
                    x = Integer.parseInt(s[2]);
                    ins[i] = x - 1;
                }
            }
            for (int i = 0; i < n; i++) {
                int ip = ins[i];
                while (ip <= 100) {
                    ip = ins[ip];
                }
                if (ip == 200) {
                    p--;
                } else {
                    p++;
                }
            }
            System.out.println(p);
            t--;
        }
    }

}
