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
public class Event {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[];
        while (true) {
            s = br.readLine().split(" ");
            long i = Long.parseLong(s[0]);
            long m = Long.parseLong(s[1]);
            if (i == 0 && m == 0) {
                break;
            }
            System.out.println(i * m);
        }
    }

}
