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
public class HoneyReservoir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2;
        while ((s1 = br.readLine()) != null && s1.length() != 0) {
            s2 = br.readLine();
            double v = Double.parseDouble(s1);
            double d = Double.parseDouble(s2);
            double h = (v / ((d / 2.0) * (d / 2.0))) / 3.14;
            double a = 3.14 * ((d / 2.0) * (d / 2.0));
            System.out.printf("ALTURA = %.2f\nAREA = %.2f\n", h, a);
        }
    }

}
