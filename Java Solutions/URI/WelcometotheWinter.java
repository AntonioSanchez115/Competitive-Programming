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
public class WelcometotheWinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        if (a > b && b <= c) {
            System.out.println(":)");
        } else if (a < b && b < c && (Math.abs(c - b) >= Math.abs(b - a))) {
            System.out.println(":)");
        } else if (a > b && b > c && (Math.abs(c - b) < Math.abs(b - a))) {
            System.out.println(":)");
        } else if (a == b && c > b) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}
