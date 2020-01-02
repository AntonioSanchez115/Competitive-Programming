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
public class Bazinga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t = 1 ; t <= tc ; t++){
            String S[] = br.readLine().split(" ");
            String s = S[0], r = S[1];
            if(s.equals("tesoura")){
                if(s.equals(r)) System.out.println("Caso #" + t + ": De novo!");
                else if(r.equals("papel") || r.equals("lagarto")) System.out.println("Caso #" + t + ": Bazinga!");
                else System.out.println("Caso #" + t + ": Raj trapaceou!");
            }else if(s.equals("papel")){
                if(s.equals(r)) System.out.println("Caso #" + t + ": De novo!");
                else if(r.equals("pedra") || r.equals("Spock")) System.out.println("Caso #" + t + ": Bazinga!");
                else System.out.println("Caso #" + t + ": Raj trapaceou!");
            }else if(s.equals("pedra")){
                if(s.equals(r)) System.out.println("Caso #" + t + ": De novo!");
                else if(r.equals("lagarto") || r.equals("tesoura")) System.out.println("Caso #" + t + ": Bazinga!");
                else System.out.println("Caso #" + t + ": Raj trapaceou!");
            }else if(s.equals("lagarto")){
                if(s.equals(r)) System.out.println("Caso #" + t + ": De novo!");
                else if(r.equals("Spock") || r.equals("papel")) System.out.println("Caso #" + t + ": Bazinga!");
                else System.out.println("Caso #" + t + ": Raj trapaceou!");
            }else if(s.equals("Spock")){
                if(s.equals(r)) System.out.println("Caso #" + t + ": De novo!");
                else if(r.equals("tesoura") || r.equals("pedra")) System.out.println("Caso #" + t + ": Bazinga!");
                else System.out.println("Caso #" + t + ": Raj trapaceou!");
            }
        }
    }
}
