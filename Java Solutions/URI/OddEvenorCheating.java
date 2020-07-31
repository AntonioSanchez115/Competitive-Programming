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
public class OddEvenorCheating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int p = Integer.parseInt(s[0]);
        int j1 = Integer.parseInt(s[1]);
        int j2 = Integer.parseInt(s[2]);
        int r = Integer.parseInt(s[3]);
        int a = Integer.parseInt(s[4]);
        if (r == 0 && a == 0) {
            if (p == 1) {
                System.out.println(((j1 + j2) % 2 == 0) ? "Jogador 1 ganha!" : "Jogador 2 ganha!");
            } else {
                System.out.println(((j1 + j2) % 2 != 0) ? "Jogador 1 ganha!" : "Jogador 2 ganha!");
            }
        } else {
            if ((r == 1 && a == 0) || (r == 0 && a == 1)) {
                System.out.println("Jogador 1 ganha!");
            } else {
                System.out.println("Jogador 2 ganha!");
            }
        }
    }

}
