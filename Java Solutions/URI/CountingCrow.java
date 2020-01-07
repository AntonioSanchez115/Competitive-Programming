/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;
import java.io.*;

/**
 *
 * @author Antonio
 */
public class CountingCrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        for (int it = 0; it < 3; it++) {
            int sum = 0;
            str = br.readLine();
            while (str.equals("caw caw") == false) {
                int binum = 0, p = 0;
                for (int i = 2; i >= 0; i--) {
                    if (str.charAt(i) == '*') {
                        binum += Math.pow(2, p);
                    }
                    p++;
                }
                sum += binum;
                str = br.readLine();
            }
            System.out.println(sum);
        }
    }
}
