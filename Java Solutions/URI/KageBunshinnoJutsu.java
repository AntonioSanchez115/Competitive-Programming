/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author hp
 */
public class KageBunshinnoJutsu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sn;
        while ((sn = br.readLine()) != null) {
            int n = Integer.parseInt(sn), t = 0;
            while (n > 1) {
                n /= 2;
                t++;
            }
            System.out.println(t);
        }
    }

}
