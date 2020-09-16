/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author hp
 */
public class IuDiOh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sn;
        while ((sn = br.readLine()) != null) {
            int n = Integer.parseInt(sn), m, l, mc, lc, a;
            String s[] = br.readLine().split(" ");
            m = Integer.parseInt(s[0]);
            l = Integer.parseInt(s[1]);
            int md[][] = new int[m][n];
            int ld[][] = new int[l][n];
            for (int i = 0; i < m; i++) {
                s = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    md[i][j] = Integer.parseInt(s[j]);
                }
            }
            for (int i = 0; i < l; i++) {
                s = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    ld[i][j] = Integer.parseInt(s[j]);
                }
            }
            s = br.readLine().split(" ");
            mc = Integer.parseInt(s[0]);
            lc = Integer.parseInt(s[1]);
            a = Integer.parseInt(br.readLine());
            if (md[mc - 1][a - 1] > ld[lc - 1][a - 1]) {
                System.out.println("Marcos");
            } else if (md[mc - 1][a - 1] < ld[lc - 1][a - 1]) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }
    }

}
