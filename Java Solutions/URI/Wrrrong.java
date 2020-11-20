import java.io.*;

public class Wrrrong {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            char c = s[1].charAt(0);
            int b = Integer.parseInt(s[2]);
            int r = Integer.parseInt(s[4]);
            System.out.print("E");
            if (c == '+') {
                for (int i = 0; i < (Math.abs(r - (a + b))); i++) {
                    System.out.print("r");
                }
            } else if (c == 'x') {
                for (int i = 0; i < (Math.abs(r - (a * b))); i++) {
                    System.out.print("r");
                }
            } else {
                for (int i = 0; i < (Math.abs(r - (a - b))); i++) {
                    System.out.print("r");
                }
            }
            System.out.println("ou!");
            t--;
        }
    }

}
