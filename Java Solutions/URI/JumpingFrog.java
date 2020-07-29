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
public class JumpingFrog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean win = true;
        String s[] = br.readLine().split(" ");
        int p = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            int pipe1 = Integer.parseInt(s[i]);
            int pipe2 = Integer.parseInt(s[i + 1]);
            if (pipe1 + p < pipe2 || pipe1 - pipe2 > p) {
                win = false;
                break;
            }
        }
        System.out.println((win) ? "YOU WIN" : "GAME OVER");
    }

}
