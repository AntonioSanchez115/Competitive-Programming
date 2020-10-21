import java.io.*;

public class JB6Team {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, a, b, c, pe = "pedra", pa = "papel", te = "tesoura";
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            a = s[0];
            b = s[1];
            c = s[2];
            if ((a.equals(pe) && b.equals(te) && c.equals(te)) || (a.equals(pa) && b.equals(pe) && c.equals(pe)) || (a.equals(te) && b.equals(pa) && c.equals(pa))) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if ((a.equals(pe) && b.equals(pa) && c.equals(pe)) || (a.equals(pa) && b.equals(te) && c.equals(pa)) || (a.equals(te) && b.equals(pe) && c.equals(te))) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if ((a.equals(pe) && b.equals(pe) && c.equals(pa)) || (a.equals(pa) && b.equals(pa) && c.equals(te)) || (a.equals(te) && b.equals(te) && c.equals(pe))) {
                System.out.println("Urano perdeu algo muito precioso...");
            } else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }
        }
    }

}
