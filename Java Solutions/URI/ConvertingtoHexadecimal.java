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
public class ConvertingtoHexadecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp, i = 1, j, r, num = Integer.parseInt(br.readLine());
        char hex[] = new char[50];
        temp = num;
        while (temp != 0) {
            r = temp % 16;
            if (r < 10) {
                hex[i++] = (char) (r + 48);
            } else {
                hex[i++] = (char) (r + 55);
            }
            temp = temp / 16;
        }
        for (j = i - 1; j > 0; j--) {
            System.out.print(hex[j]);
        }
        System.out.println("");
    }

}
