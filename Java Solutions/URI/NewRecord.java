/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author Pc6
 */
public class NewRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            Vector v = new Vector(1, 1);
            v.add(1);
            float highScore = 0.0f, t, d;
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                t = Float.parseFloat(s[0]);
                d = Float.parseFloat(s[1]);
                if (i == 0) {
                    highScore = d / t;
                } else {
                    if (d / t > highScore) {
                        highScore = d / t;
                        v.add(i + 1);
                    }
                }
            }
            Collections.sort(v);
            for (int i = 0; i < v.size(); i++) {
                System.out.println(v.elementAt(i));
            }
        }
    }
    
}
