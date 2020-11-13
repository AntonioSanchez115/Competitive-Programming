import java.io.*;

public class GuysTruco1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            Boolean q = false, j = false, k = false, a = false;
            s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'Q') {
                    q = true;
                }
                if (s.charAt(i) == 'J') {
                    j = true;
                }
                if (s.charAt(i) == 'K') {
                    k = true;
                }
                if (s.charAt(i) == 'A') {
                    a = true;
                }
            }
            System.out.println(((q && j && k && a) ? "Aaah muleke" : "Ooo raca viu"));
            n--;
        }
    }

}
