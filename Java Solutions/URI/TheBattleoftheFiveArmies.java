import java.io.*;

public class TheBattleoftheFiveArmies {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1, a2, a3, b1, b2, x;
        String s[] = br.readLine().split(" ");
        a1 = Integer.parseInt(s[0]);
        a2 = Integer.parseInt(s[1]);
        a3 = Integer.parseInt(s[2]);
        b1 = Integer.parseInt(s[3]);
        b2 = Integer.parseInt(s[4]);
        x = Integer.parseInt(s[5]);
        System.out.println((((a1 + a2 + a3 + x) >= (b1 + b2)) ? "Middle-earth is safe." : "Sauron has returned."));
    }

}
