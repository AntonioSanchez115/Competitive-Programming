/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;
import java.io.*;
/**
 *
 * @author comer
 */
public class SearchingForNessy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        while(c>0){
            String s[] = br.readLine().split(" ");
            long a = Long.parseLong(s[0]), b = Long.parseLong(s[1]);
            System.out.println((long)Math.ceil((a-2)/3.00)*(long)Math.ceil((b-2)/3.00));
            c--;
        }
    }
    
}
