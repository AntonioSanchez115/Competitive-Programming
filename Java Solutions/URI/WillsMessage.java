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
public class WillsMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(s[i]);
                System.out.print(str.charAt(x - 1));
            }
            System.out.println("");
        }
    }

}
