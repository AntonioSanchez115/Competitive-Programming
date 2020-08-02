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
public class Parity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }
        System.out.print(s);
        System.out.println((one % 2 == 0) ? 0 : 1);
    }

}
