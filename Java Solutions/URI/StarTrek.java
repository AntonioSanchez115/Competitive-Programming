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
public class StarTrek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long nstoled = 0;
        int j = 0, atk = 0, n = Integer.parseInt(br.readLine());
        int star[] = new int[n];
        boolean stoled[] = new boolean[n];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            stoled[i] = false;
            int x = Integer.parseInt(s[i]);
            star[i] = x;
        }
        while (true) {
            if (stoled[j] == false) {
                stoled[j] = true;
            }
            if ((star[j]) % 2 == 0) {
                star[j]--;
                j--;
                if (j < 0 || star[j] == 0) {
                    break;
                }
            } else {
                star[j]--;
                j++;
                if (j == n || star[j] == 0) {
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (stoled[i]) {
                atk++;
            }
            nstoled += star[i];
        }
        System.out.println(atk + " " + nstoled);
    }

}
