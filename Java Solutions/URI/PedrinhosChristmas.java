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
public class PedrinhosChristmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int m = Integer.parseInt(s[0]);
            int x = 0, d = Integer.parseInt(s[1]);
            for (int i = 0; i < m - 1; i++) {
                x += y[i];
            }
            x += d;
            if (x < 359) {
                System.out.println("Faltam " + (360 - x) + " dias para o natal!");
            } else if (x == 359) {
                System.out.println("E vespera de natal!");
            } else if (x == 360) {
                System.out.println("E natal!");
            } else {
                System.out.println("Ja passou!");
            }
        }
    }

}
