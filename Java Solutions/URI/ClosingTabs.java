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
public class ClosingTabs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        for (int i = 0; i < m; i++) {
            String act = br.readLine();
            if (act.equals("fechou")) {
                n++;
            } else {
                n--;
            }
        }
        System.out.println((n < 0) ? 0 : n);
    }

}
