import java.io.*;

public class EvergreenTrick {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2;
        int t, i, j;
        t = Integer.parseInt(br.readLine());
        while ((t--) > 0) {
            s1 = br.readLine();
            s2 = br.readLine();
            i = 0;
            j = 0;
            while (j < s2.length()) {
                for (int x = 0; x < 2; x++) {
                    System.out.print(s1.charAt(i++));
                }
                for (int x = 0; x < 2 && j < s2.length(); x++) {
                    System.out.print(s2.charAt(j++));
                }
            }
            System.out.println("");
        }
    }

}
