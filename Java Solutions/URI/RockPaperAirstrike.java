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
public class RockPaperAirstrike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        while (c > 0) {
            String p1 = br.readLine(), p2 = br.readLine();
            if (p1.equals("ataque")) {
                if (p2.equals("pedra") || p2.equals("papel")) {
                    System.out.println("Jogador 1 venceu");
                } else {
                    System.out.println("Aniquilacao mutua");
                }
            } else if (p1.equals("pedra")) {
                if (p2.equals("pedra")) {
                    System.out.println("Sem ganhador");
                } else if (p2.equals("papel")) {
                    System.out.println("Jogador 1 venceu");
                } else {
                    System.out.println("Jogador 2 venceu");
                }
            } else {
                if (p2.equals("pedra")) {
                    System.out.println("Jogador 2 venceu");
                } else if (p2.equals("papel")) {
                    System.out.println("Ambos venceram");
                } else {
                    System.out.println("Jogador 2 venceu");
                }
            }
            c--;
        }
    }

}
