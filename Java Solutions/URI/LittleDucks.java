/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.math.BigInteger;

/**
 *
 * @author asus
 */
public class LittleDucks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            BigInteger n = new BigInteger(s);
            if (n.compareTo(BigInteger.ZERO) < 0) {
                break;
            }
            if (n.equals(BigInteger.ZERO)) {
                System.out.println("0");
            } else {
                n = n.subtract(BigInteger.ONE);
                System.out.println(n);
            }
        }
    }

}
