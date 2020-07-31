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
public class SearchingSubsequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1, n2;
        int t = 1;
        while ((n1 = br.readLine()) != null) {
            n2 = br.readLine();
            n2 += 'x';
            int pos = 0, s = 0;
            for (int i = 0; i < (n2.length() - n1.length()); i++) {
                String sub = n2.substring(i, n1.length() + i);
                if (sub.equals(n1)) {
                    s++;
                    pos = i + 1;
                }
            }
            System.out.println("Caso #" + (t++) + ":");
            System.out.println((s == 0) ? ("Nao existe subsequencia\n") : ("Qtd.Subsequencias: " + s + "\nPos: " + pos + "\n"));
        }
    }

}
