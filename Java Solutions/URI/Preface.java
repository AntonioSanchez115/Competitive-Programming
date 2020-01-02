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
public class Preface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if(a > 0 || (a % b) == 0){
            System.out.println((a / b)+" "+(a % b));
        }else{
            if(a == 0) System.out.println("0 0");
            else if(b < 0) System.out.println(((a/b)+1)+" "+((a%b)-b));
            else System.out.println(((a/b)-1)+" "+((a%b)+b));
        }
    }
    
}
