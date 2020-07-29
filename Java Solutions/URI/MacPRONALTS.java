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
public class MacPRONALTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        double res = 0, prices[] = {1.5, 2.5, 3.5, 4.5, 5.5};
        for (int i = 0; i < p; i++) {
            String s[] = br.readLine().split(" ");
            int id = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            res += prices[(id % 10) - 1] * n;
        }
        System.out.printf("%.2f\n", res);
    }

}
