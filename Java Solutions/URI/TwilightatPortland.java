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
public class TwilightatPortland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c[][] = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 0; j < n + 1; j++) {
                c[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cam = 0;
                if (c[i][j] == 1) {
                    cam++;
                }
                if (c[i][j + 1] == 1) {
                    cam++;
                }
                if (c[i + 1][j] == 1) {
                    cam++;
                }
                if (c[i + 1][j + 1] == 1) {
                    cam++;
                }
                System.out.print((cam >= 2) ? "S" : "U");
            }
            System.out.println("");
        }
    }

}
