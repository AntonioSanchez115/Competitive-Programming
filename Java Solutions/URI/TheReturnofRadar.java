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
public class TheReturnofRadar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int t = Integer.parseInt(s);
            if (t == 0) {
                break;
            }
            int n;
            for (int i = 0; i < t; i++) {
                n = Integer.parseInt(br.readLine());
                System.out.println(((n % 2 == 0) ? ((n - 2) * 2 + 2) : ((n - 1) * 2 + 1)));
            }
        }

    }

}
