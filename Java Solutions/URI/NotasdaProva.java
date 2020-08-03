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
public class NotasdaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            if (n < 1) {
                System.out.println("E");
            } else if (n >= 1 && n <= 35) {
                System.out.println("D");
            } else if (n >= 36 && n <= 60) {
                System.out.println("C");
            } else if (n >= 61 && n <= 85) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }

}
