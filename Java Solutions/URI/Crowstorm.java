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
public class Crowstorm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int xf = Integer.parseInt(s[0]);
            int yf = Integer.parseInt(s[1]);
            int xi = Integer.parseInt(s[2]);
            int yi = Integer.parseInt(s[3]);
            int v = Integer.parseInt(s[4]);
            int r1 = Integer.parseInt(s[5]);
            int r2 = Integer.parseInt(s[6]);
            double dist = Math.sqrt((Math.pow((xi - xf), 2) + Math.pow((yi - yf), 2)));
            double attackDist = r1 + r2;
            if (v != 0) {
                dist += (v * 1.5);
            }
            System.out.println((dist <= attackDist) ? "Y" : "N");
        }
    }

}
