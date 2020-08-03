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
public class MerryChristmaaas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print("Feliz nat");
        for (int i = 0; i < n; i++) {
            System.out.print("a");
        }
        System.out.println("l!");
    }

}
