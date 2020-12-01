import java.io.*;

public class KiloMan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int s = Integer.parseInt(br.readLine());
            int hit = 0;
            int shoot[] = new int[s];
            String str[] = br.readLine().split(" ");
            for (int i = 0; i < s; i++) {
                shoot[i] = Integer.parseInt(str[i]);
            }
            String seq = br.readLine();
            for (int i = 0; i < seq.length(); i++) {
                if (seq.charAt(i) == 'S') {
                    if (shoot[i] <= 2) {
                        hit++;
                    }
                } else {
                    if (shoot[i] > 2) {
                        hit++;
                    }
                }
            }
            System.out.println(hit);
            t--;
        }
    }

}
