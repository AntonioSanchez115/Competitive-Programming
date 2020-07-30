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
public class BinosChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m2 = 0, m3 = 0, m4 = 0, m5 = 0, n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s[i]);
            if (x % 2 == 0) {
                m2++;
            }
            if (x % 3 == 0) {
                m3++;
            }
            if (x % 4 == 0) {
                m4++;
            }
            if (x % 5 == 0) {
                m5++;
            }
        }
        System.out.println(m2 + " Multiplo(s) de 2");
        System.out.println(m3 + " Multiplo(s) de 3");
        System.out.println(m4 + " Multiplo(s) de 4");
        System.out.println(m5 + " Multiplo(s) de 5");
    }

}
