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
public class CMaisouMenos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int t = Integer.parseInt(str);
            if (t == 0) {
                break;
            }
            int c = 0;
            for (int i = 0; i < t; i++) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                String food = s[1];
                if (s.length > 2) {
                    for (int j = 2; j < s.length; j++) {
                        food += " ";
                        food += s[j];
                    }
                }
                if (food.equals("suco de laranja")) {
                    c += (n * 120);
                }
                if (food.equals("morango fresco") || food.equals("mamao")) {
                    c += (n * 85);
                }
                if (food.equals("goiaba vermelha")) {
                    c += (n * 70);
                }
                if (food.equals("manga")) {
                    c += (n * 56);
                }
                if (food.equals("laranja")) {
                    c += (n * 50);
                }
                if (food.equals("brocolis")) {
                    c += (n * 34);
                }
            }
            if (c < 110) {
                System.out.println("Mais " + (110 - c) + " mg");
            } else if (c > 130) {
                System.out.println("Menos " + (c - 130) + " mg");
            } else {
                System.out.println(c + " mg");
            }
        }
    }

}
