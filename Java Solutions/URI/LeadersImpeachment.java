/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author hp
 */
public class LeadersImpeachment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){
            int n = Integer.parseInt(str),y=0;
            String s[] = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                if(s[i].equals("1")) y++;
            }
            System.out.println((y>=(2*(n/3.0))?"impeachment":"acusacao arquivada"));
        }
    }
    
}
