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
public class WhoseTurnIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        while (c > 0) {
            String s[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            if ((a + b) % 2 == 1) {
                System.out.println(((s[1].equals("IMPAR") ? s[0] : s[2])));
            } else {
                System.out.println(((s[1].equals("PAR") ? s[0] : s[2])));
            }
            c--;
        }
    }

}
