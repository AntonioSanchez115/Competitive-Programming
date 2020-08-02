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
public class WalkinginTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        boolean p = false;
        if(a==b || b==c || a==c) p=true;
        if((a-b+c)==0) p=true;
        if((a-c+b)==0) p=true;
        if((b-a+c)==0) p=true;
        if((b-c+a)==0) p=true;
        if((c-a+b)==0) p=true;
        if((c-b+a)==0) p=true;
        System.out.println((p)?'S':'N');
    }
    
}
