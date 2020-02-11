/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVa;

import java.io.*;

/**
 *
 * @author comer
 */
public class DivisionofNlogonia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        while(k != 0){
            int n = 0, m = 0, x, y;
            String s[] = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            for (int i = 0; i < k; i++) {
                s = br.readLine().split(" ");
                x = Integer.parseInt(s[0]);
                y = Integer.parseInt(s[1]);
                if (x == n || y == m) {
                    System.out.println("divisa");
                } else if (x > n && y > m) {
                    System.out.println("NE");
                } else if (x < n && y > m) {
                    System.out.println("NO");
                } else if (x < n && y < m) {
                    System.out.println("SO");
                } else {
                    System.out.println("SE");
                }
            }
            k = Integer.parseInt(br.readLine());
        }
    }
}
