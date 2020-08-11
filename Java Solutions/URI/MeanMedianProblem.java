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
public class MeanMedianProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            long a = Long.parseLong(s[0]);
            long b = Long.parseLong(s[1]);
            if (a + b == 0) {
                break;
            }
            System.out.println((a <= b) ? (a - Math.abs(a - b)) : (b - Math.abs(a - b)));
        }
    }

}
