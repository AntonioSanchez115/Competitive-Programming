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
public class RollerCoaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            int al = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(br.readLine());
                if (x >= a && x <= b) {
                    al++;
                }
            }
            System.out.println(al);
        }
    }

}
