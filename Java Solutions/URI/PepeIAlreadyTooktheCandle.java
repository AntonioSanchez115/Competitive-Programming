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
public class PepeIAlreadyTooktheCandle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s[] = br.readLine().split(" ");
            int h = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int o = Integer.parseInt(s[2]);
            System.out.printf("%02d:%02d - A porta ", h, m);
            System.out.println(((o == 1) ? "abriu!" : "fechou!"));
            t--;
        }
    }

}
