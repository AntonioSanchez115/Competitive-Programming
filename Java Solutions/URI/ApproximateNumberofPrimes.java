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
public class ApproximateNumberofPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        double p = n / Math.log((double) n);
        double m = (n / Math.log((double) n)) * 1.25506;
        System.out.printf("%.1f %.1f\n", p, m);
    }

}
