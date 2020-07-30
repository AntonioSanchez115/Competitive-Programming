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
public class SequenceofSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1, n;
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            int s = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    s++;
                }
            }
            System.out.print("Caso " + t + ": " + s + " ");
            System.out.println((s == 1) ? "numero" : "numeros");
            System.out.print(0);
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("\n");
            t++;
        }
    }

}
