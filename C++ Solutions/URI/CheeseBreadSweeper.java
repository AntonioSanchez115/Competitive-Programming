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
public class CheeseBreadSweeper {

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
            int m = Integer.parseInt(s[1]);
            int[][] M = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    M[i][j] = Integer.parseInt(s[j]);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(M[i][j] == 1) System.out.print(9);
                    else{
                        int c = 0;
                        if(i != 0 && M[i - 1][j] == 1) c++;
                        if(j != m - 1 && M[i][j + 1] == 1) c++;
                        if(i != n - 1 && M[i + 1][j] == 1) c++;
                        if(j != 0 && M[i][j - 1] == 1) c++;
                        System.out.print(c);
                    }
                }
                System.out.println("");
            }
        }
    }

}
