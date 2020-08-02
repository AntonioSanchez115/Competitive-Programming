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
public class PomekonsBattle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int b = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a1 = Integer.parseInt(s[0]);
            int d1 = Integer.parseInt(s[1]);
            int l1 = Integer.parseInt(s[2]);
            s = br.readLine().split(" ");
            int a2 = Integer.parseInt(s[0]);
            int d2 = Integer.parseInt(s[1]);
            int l2 = Integer.parseInt(s[2]);
            double v1, v2;
            v1 = (a1 + d1) / 2.0;
            v2 = (a2 + d2) / 2.0;
            if (l1 % 2 == 0) {
                v1 += b;
            }
            if (l2 % 2 == 0) {
                v2 += b;
            }
            if (v1 == v2) {
                System.out.println("Empate");
            } else if (v1 > v2) {
                System.out.println("Dabriel");
            } else {
                System.out.println("Guarte");
            }
            t--;
        }
    }

}
