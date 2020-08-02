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
public class EngineFailure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pos = 0, p = 0, n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s[i]);
            if (i == 0) {
                p = a;
            } else {
                if (a < p) {
                    pos = i + 1;
                    break;
                } else {
                    p = a;
                }
            }
        }
        System.out.println(pos);
    }

}
