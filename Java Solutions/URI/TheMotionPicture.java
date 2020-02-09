/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;
import java.io.*;
/**
 *
 * @author comer
 */
public class TheMotionPicture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        double a = Double.parseDouble(s[0]), b = Double.parseDouble(s[1]);
        System.out.printf("%.2f%%\n",((b-a)/(a/100.00)));
    }
    
}
