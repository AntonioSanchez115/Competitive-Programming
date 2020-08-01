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
public class TheForceAwakens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int x = 0, y = 0, n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        int T[][] = new int[n][m];
        boolean found = false;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                T[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (T[i][j] == 42) {
                    boolean patt = true;
                    if(T[i-1][j-1]!=7) patt=false;
                    if(T[i-1][j]!=7) patt=false;
                    if(T[i-1][j+1]!=7) patt=false;
                    if(T[i][j-1]!=7) patt=false;
                    if(T[i][j+1]!=7) patt=false;
                    if(T[i+1][j-1]!=7) patt=false;
                    if(T[i+1][j]!=7) patt=false;
                    if(T[i+1][j+1]!=7) patt=false;
                    if (patt && !found) {
                        x = i + 1;
                        y = j + 1;
                        found = true;
                    }
                }
            }
        }
        System.out.println(x + " " + y);
    }

}
