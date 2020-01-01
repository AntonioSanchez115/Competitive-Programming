/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COJ;

/**
 *
 * @author Antonio
 * COJ
 * 4092 - Lightweight
 */
import java.util.*;
public class Lightweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int b = cin.nextInt();
        if(b<2) System.out.println("WRONG ANSWER");
        else if(b>3) System.out.println("RUNTIME ERROR");
        else System.out.println("ACCEPTED");
    }
    
}
