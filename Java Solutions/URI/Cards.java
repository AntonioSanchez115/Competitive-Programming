import java.io.*;

public class Cards {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = 0, x2 = 0;
        String s[] = br.readLine().split(" ");
        Boolean C = true, D = true;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                x1 = Integer.parseInt(s[0]);
            } else {
                x2 = Integer.parseInt(s[i]);
                if (x2 < x1) {
                    C = false;
                } else {
                    D = false;
                }
                x1 = x2;
            }
        }
        if (C) {
            System.out.println("C");
        } else if (D) {
            System.out.println("D");
        } else {
            System.out.println("N");
        }
    }

}
