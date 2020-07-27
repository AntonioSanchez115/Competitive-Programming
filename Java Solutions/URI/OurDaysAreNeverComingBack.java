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
public class OurDaysAreNeverComingBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }

}
