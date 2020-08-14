/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Vector;

/**
 *
 * @author asus
 */
public class GeneralExam {

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
            int q = Integer.parseInt(s[1]);
            Vector ctzn = new Vector(1, 1);
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(br.readLine());
                ctzn.add(c);
            }
            sort(ctzn, Collections.reverseOrder());
            for (int i = 0; i < q; i++) {
                int p = Integer.parseInt(br.readLine());
                System.out.println(ctzn.elementAt(p - 1));
            }
        }
    }

}
