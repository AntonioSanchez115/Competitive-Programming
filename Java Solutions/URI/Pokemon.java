import java.io.*;

public class Pokemon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String name;
            double L, Bs, IV, EV, Hp, S;
            String s[] = br.readLine().split(" ");
            name = s[0];
            L = Double.parseDouble(s[1]);
            System.out.println("Caso #" + tc + ": " + name + " nivel " + (int) L);
            s = br.readLine().split(" ");
            Bs = Double.parseDouble(s[0]);
            IV = Double.parseDouble(s[1]);
            EV = Double.parseDouble(s[2]);
            Hp = ((IV + Bs + Math.sqrt(EV) / 8 + 50) * L) / 50 + 10;
            System.out.println("HP: " + (int) Hp);
            s = br.readLine().split(" ");
            Bs = Double.parseDouble(s[0]);
            IV = Double.parseDouble(s[1]);
            EV = Double.parseDouble(s[2]);
            S = ((IV + Bs + Math.sqrt(EV) / 8) * L) / 50 + 5;
            System.out.println("AT: " + (int) S);
            s = br.readLine().split(" ");
            Bs = Double.parseDouble(s[0]);
            IV = Double.parseDouble(s[1]);
            EV = Double.parseDouble(s[2]);
            System.out.println("DF: " + (int) (((IV + Bs + Math.sqrt(EV) / 8) * L) / 50 + 5));
            s = br.readLine().split(" ");
            Bs = Double.parseDouble(s[0]);
            IV = Double.parseDouble(s[1]);
            EV = Double.parseDouble(s[2]);
            System.out.println("SP: " + (int) (((IV + Bs + Math.sqrt(EV) / 8) * L) / 50 + 5));
        }
    }

}
