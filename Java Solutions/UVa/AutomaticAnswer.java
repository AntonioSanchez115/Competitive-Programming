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
public class AutomaticAnswer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            Long n = Long.parseLong(br.readLine());
            n = (((n * 567 / 9) + 7492) * 235 / 47) - 498;
            n /= 10;
            System.out.println(Math.abs((long) n % 10));
            t--;
        }
    }
}
