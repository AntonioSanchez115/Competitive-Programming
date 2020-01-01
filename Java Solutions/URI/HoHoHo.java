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
public class HoHoHo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1 ; i < n ; i++){
            System.out.print("Ho ");
        }
        System.out.println("Ho!");
    }
    
}
