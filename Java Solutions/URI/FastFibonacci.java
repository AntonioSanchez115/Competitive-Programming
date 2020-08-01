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
public class FastFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double F = (Math.pow(((1 + Math.sqrt(5.0)) / 2.0), n) - Math.pow(((1 - Math.sqrt(5.0)) / 2.0), n)) / Math.sqrt(5.0);
        System.out.printf("%.1f\n", F);
    }

}
