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
public class SquareRootof10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double F = 0.0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                F = 1 / 6.0;
            } else {
                F = 1 / (6 + F);
            }
        }
        System.out.printf("%.10f\n", (3 + F));
    }

}
