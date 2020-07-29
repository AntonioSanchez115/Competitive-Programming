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
public class TheChosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id, idx = -1, n = Integer.parseInt(br.readLine());
        double note, maxNote = 8;
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            id = Integer.parseInt(s[0]);
            note = Double.parseDouble(s[1]);
            if (note >= maxNote) {
                maxNote = note;
                idx = id;
            }
        }
        if (idx > 0) {
            System.out.println(idx);
        } else {
            System.out.println("Minimum note not reached");
        }
    }

}
