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
public class RomanNumeralsforPageNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine(), roman = "";
        int num, n = Integer.parseInt(x);
        String[] units = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hund = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        if (x.length() > 2) {
            num = x.charAt(0) - '0';
            roman += hund[num - 1];
            num = x.charAt(1) - '0';
            if (num != 0) {
                roman += tens[num - 1];
            }
            num = x.charAt(2) - '0';
            if (num != 0) {
                roman += units[num - 1];
            }
        } else if (x.length() > 1) {
            num = x.charAt(0) - '0';
            roman += tens[num - 1];
            num = x.charAt(1) - '0';
            if (num != 0) {
                roman += units[num - 1];
            }
        } else {
            num = x.charAt(0) - '0';
            roman += units[num - 1];
        }
        System.out.println(roman);
    }

}
