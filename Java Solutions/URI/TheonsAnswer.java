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
public class TheonsAnswer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int min=0,pos=0,t;
        for(int i=0;i<n;i++){
            t = Integer.parseInt(s[i]);
            if(i==0){
                min = t;
                pos = i+1;
            }else{
                if(t<min){
                    min = t;
                    pos = i+1;
                }
            }
        }
        System.out.println(pos);
    }
    
}
