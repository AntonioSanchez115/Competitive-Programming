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
public class UFPRGaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int N = Integer.parseInt(s[0]);
            int I = Integer.parseInt(s[1]);
            int v = 0;
            for (int i = 0; i < N; i++) {
                s = br.readLine().split(" ");
                int id = Integer.parseInt(s[0]);
                int j = Integer.parseInt(s[1]);
                if (id == I && j == 0) {
                    v++;
                }
            }
            System.out.println(v);
        }
    }

}
