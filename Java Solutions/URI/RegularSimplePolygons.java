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
public class RegularSimplePolygons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        System.out.println(a * b);
    }

}
