/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVa;
import java.io.*;
/**
 *
 * @author comer
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        while(c>0){
            int n = Integer.parseInt(br.readLine());
            int h=0,l=0,x;
            String s[] = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                x = Integer.parseInt(s[i]);
                if(i==0){
                    h=x;
                    l=x;
                }
                if(x>h) h=x;
                if(x<l) l=x;
            }
            System.out.println((h-l)*2);
            c--;
        }
    }
    
}
