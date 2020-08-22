/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.*;

/**
 *
 * @author hp
 */
public class Internship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int Enxc = 0, Ec = 0, m = Integer.parseInt(str);
            for (int i = 0; i < m; i++) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int c = Integer.parseInt(s[1]);
                Enxc += (n * c);
                Ec += c;
            }
            Ec *= 100;
            System.out.printf("%.4f\n", ((double) Enxc / (double) Ec));
        }
    }

}
