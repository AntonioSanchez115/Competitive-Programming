/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author asus
 */
public class TwoBills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            if (n == 0 && m == 0) {
                break;
            }
            int c = m - n, p = 0, b = 0;
            while (p <= c && p + 100 <= c) {
                p += 100;
                b++;
            }
            while (p <= c && p + 50 <= c) {
                p += 50;
                b++;
            }
            while (p <= c && p + 20 <= c) {
                p += 20;
                b++;
            }
            while (p <= c && p + 10 <= c) {
                p += 10;
                b++;
            }
            while (p <= c && p + 5 <= c) {
                p += 5;
                b++;
            }
            while (p <= c && p + 2 <= c) {
                p += 2;
                b++;
            }
            System.out.println((p == c && b == 2) ? "possible" : "impossible");

        }
    }

}
