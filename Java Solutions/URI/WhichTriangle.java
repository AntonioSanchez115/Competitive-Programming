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
public class WhichTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            System.out.print("Valido-");
            if (a == b && b == c) {
                System.out.println("Equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isoceles");
            } else {
                System.out.println("Escaleno");
            }
            System.out.print("Retangulo: ");
            if (((long) c * c == (long) a * a + (long) b * b) || ((long) b * b == (long) a * a + (long) c * c) || ((long) a * a == (long) b * b + (long) c * c)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        } else {
            System.out.println("Invalido");
        }
    }

}
