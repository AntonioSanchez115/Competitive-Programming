import java.io.*;

public class TurnLeft {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int dir = 1;
            String s = br.readLine();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'D') {
                    if (dir == 4) {
                        dir = 1;
                    } else {
                        dir++;
                    }
                } else {
                    if (dir == 1) {
                        dir = 4;
                    } else {
                        dir--;
                    }
                }
            }
            if (dir == 1) {
                System.out.println("N");
            }
            if (dir == 2) {
                System.out.println("L");
            }
            if (dir == 3) {
                System.out.println("S");
            }
            if (dir == 4) {
                System.out.println("O");
            }
        }
    }

}
