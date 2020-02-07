/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.*;

/**
 *
 * @author comer
 */
public class ALongLongTimeAgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n, t = 0, y = 0;
        n = Long.parseLong(br.readLine());
        while(n-- > 0){
            t = Long.parseLong(br.readLine());
            y = t - 2014;
            if(y > 0) System.out.println(y+" A.C.");
            else System.out.println((Math.abs(y)+1)+" D.C.");
        }
    }
}
