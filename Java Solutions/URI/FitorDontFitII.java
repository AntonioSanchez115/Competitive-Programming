import java.io.*;

public class FitorDontFitII {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2, s[];
        Boolean fit;
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            s = br.readLine().split(" ");
            s1 = s[0];
            s2 = s[1];
            if (s2.length() > s1.length()) {
                System.out.println("nao encaixa");
            } else {
                fit = true;
                for (int i = s2.length() - 1, j = s1.length() - 1; i >= 0; i--, j--) {
                    if (s2.charAt(i) != s1.charAt(j)) {
                        fit = false;
                    }
                }
                System.out.println(((fit) ? "encaixa" : "nao encaixa"));
            }
            t--;
        }
    }

}
