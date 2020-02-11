/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVa;
import java.io.*;
import static java.util.Arrays.sort;
/**
 *
 * @author comer
 */
public class CostCutting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= t; tc++){
            int[] vec = new int[3];
            String s[] = br.readLine().split(" ");
            for(int i=0;i<3;i++){
                vec[i] = Integer.parseInt(s[i]);
            }
            sort(vec,0,3);
            System.out.println("Case "+tc+": "+vec[1]);
        }
    }
    
}
