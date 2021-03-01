import java.io.*;

public class Queen {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int x = Integer.parseInt(s[2]);
            int y = Integer.parseInt(s[3]);
            if ((a + b + x + y) == 0) {
                break;
            }
            if (a == x && b == y) {
                System.out.println("0");
            } else if ((Math.abs(a - x) == Math.abs(b - y)) || (a == x || b == y)) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }

}
