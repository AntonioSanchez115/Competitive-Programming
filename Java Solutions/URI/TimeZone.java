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
public class TimeZone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s, t, f, T;
        String st[] = br.readLine().split(" ");
        s = Integer.parseInt(st[0]);
        t = Integer.parseInt(st[1]);
        f = Integer.parseInt(st[2]);
        T = (s + t + f);
        if (T < 0) {
            System.out.println(24 + T);
        } else if (T >= 24) {
            System.out.println(T - 24);
        } else {
            System.out.println(T);
        }
    }

}
