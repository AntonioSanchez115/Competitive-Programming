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
public class IdentifyingTea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0, t = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            int x = Integer.parseInt(s[i]);
            if (x == t) {
                c++;
            }
        }
        System.out.println(c);
    }

}
