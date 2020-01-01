/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;
import java.io.*;
/**
 *
 * @author Antonio
 */
public class TheRaceofSlugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int L,V,hi = 0;
        while((str = br.readLine()) != null && (str = str.trim()).length() > 0 ){
           L = Integer.parseInt(str);
           String str1[] = br.readLine().split(" ");
           for(int i = 0 ; i < L ; i++){
               V = Integer.parseInt(str1[i]);
               if(i == 0){
                   hi = V;
               }else{
                   if(V > hi) hi = V;
               }
           }
           if(hi < 10) System.out.println("1");
           else if(hi >= 10 && hi < 20) System.out.println("2");
           else System.out.println("3");
        }
    }
    
}
