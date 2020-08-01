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
public class NameatForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", L;
        while ((L = br.readLine()) != null) {
            str += L;
        }
        System.out.println((str.length() <= 80) ? "YES" : "NO");
    }

}
