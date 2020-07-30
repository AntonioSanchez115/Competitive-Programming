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
public class SundayMorning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h;
        while ((h = br.readLine()) != null) {
            int bino = (h.charAt(0) - '0') * 60;
            bino += Integer.parseInt(h.substring(2, 4));
            System.out.print("Atraso maximo: ");
            System.out.println((bino <= 420) ? 0 : (bino - 420));
        }
    }

}
