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
public class Triangle {

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
        int d = Integer.parseInt(s[3]);
        boolean possible = false;
        if (a + b > c && a + c > b && c + b > a) {
            possible = true;
        }
        if (b + c > d && b + d > c && c + d > b) {
            possible = true;
        }
        if (a + b > d && a + d > b && b + d > a) {
            possible = true;
        }
        if (a + c > d && a + d > c && c + d > a) {
            possible = true;
        }
        System.out.println((possible) ? "S" : "N");
    }

}
