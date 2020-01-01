/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Antonio
 */
public class BobConduit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int cs = 0 ; cs < t ; cs++){
            String s[] = br.readLine().split(" ");
            int r1 = Integer.parseInt(s[0]);
            int r2 = Integer.parseInt(s[1]);
            System.out.println(r1+r2);
        }
    }
    
}
