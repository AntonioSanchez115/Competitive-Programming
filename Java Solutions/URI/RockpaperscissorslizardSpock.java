import java.io.*;

public class RockpaperscissorslizardSpock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String r, s, S[];
        while (t>0) {
            S = br.readLine().split(" ");
            r = S[0];
            s = S[1];
            if (r.equals(s)) System.out.println("empate");
            else {
                if (r.equals("pedra")) {
                    if (s.equals("papel")) System.out.println("sheldon");
                    if (s.equals("tesoura")) System.out.println("rajesh");
                    if (s.equals("lagarto")) System.out.println("rajesh");
                    if (s.equals("spock")) System.out.println("sheldon");
                }
                if (r.equals("papel")) {
                    if (s.equals("pedra")) System.out.println("rajesh");
                    if (s.equals("tesoura")) System.out.println("sheldon");
                    if (s.equals("lagarto")) System.out.println("sheldon");
                    if (s.equals("spock")) System.out.println("rajesh");
                }
                if (r.equals("tesoura")) {
                    if (s.equals("papel")) System.out.println("rajesh");
                    if (s.equals("pedra")) System.out.println("sheldon");
                    if (s.equals("lagarto")) System.out.println("rajesh");
                    if (s.equals("spock")) System.out.println("sheldon");
                }
                if (r.equals("lagarto")) {
                    if (s.equals("papel")) System.out.println("rajesh");
                    if (s.equals("tesoura")) System.out.println("sheldon");
                    if (s.equals("pedra")) System.out.println("sheldon");
                    if (s.equals("spock")) System.out.println("rajesh");
                }
                if (r.equals("spock")) {
                    if (s.equals("papel")) System.out.println("sheldon");
                    if (s.equals("tesoura")) System.out.println("rajesh");
                    if (s.equals("lagarto")) System.out.println("sheldon");
                    if (s.equals("pedra")) System.out.println("rajesh");
                }
            }
            t--;
        }        
    }
    
}
