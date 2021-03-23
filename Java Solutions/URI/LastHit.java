import java.io.*;

public class LastHit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int At, Ad, Bt, Bd, h, time = 0;
            String winner;
            String s[] = br.readLine().split(" ");
            At = Integer.parseInt(s[0]);
            Ad = Integer.parseInt(s[1]);
            Bt = Integer.parseInt(s[2]);
            Bd = Integer.parseInt(s[3]);
            h = Integer.parseInt(br.readLine());
            while (true) {
                if (time % Ad == 0) {
                    h -= At;
                }
                if (h <= 0) {
                    winner = "Andre";
                    break;
                }
                if (time % Bd == 0) {
                    h -= Bt;
                }
                if (h <= 0) {
                    winner = "Beto";
                    break;
                }
                time++;
            }
            System.out.println(winner);
            t--;
        }
    }

}
