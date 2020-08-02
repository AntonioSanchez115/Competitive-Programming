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
public class Volleyball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double s, b, a, st1 = 0, bt1 = 0, at1 = 0, st2 = 0, bt2 = 0, at2 = 0;
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            String str[] = br.readLine().split(" ");
            s = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[1]);
            a = Double.parseDouble(str[2]);
            st1 += s;
            bt1 += b;
            at1 += a;
            str = br.readLine().split(" ");
            s = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[1]);
            a = Double.parseDouble(str[2]);
            st2 += s;
            bt2 += b;
            at2 += a;
        }
        System.out.printf("Pontos de Saque: %.2f %%.\n", (st2 / st1 * 100.0));
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", (bt2 / bt1 * 100.0));
        System.out.printf("Pontos de Ataque: %.2f %%.\n", (at2 / at1 * 100.0));
    }

}
