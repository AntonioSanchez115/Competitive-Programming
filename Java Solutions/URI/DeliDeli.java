import java.io.*;

public class DeliDeli {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int l = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        String irr[] = new String[l];
        String plu[] = new String[l];
        String word;
        for (int i = 0; i < l; i++) {
            s = br.readLine().split(" ");
            irr[i] = s[0];
            plu[i] = s[1];
        }
        for (int i = 0; i < n; i++) {
            Boolean match = false;
            word = br.readLine();
            for (int j = 0; j < l; j++) {
                if (word.equals(irr[j])) {
                    System.out.println(plu[j]);
                    match = true;
                }
            }
            if (!match && word.charAt(word.length() - 2) != 'a' && word.charAt(word.length() - 2) != 'e' && word.charAt(word.length() - 2) != 'i' && word.charAt(word.length() - 2) != 'o' && word.charAt(word.length() - 2) != 'u' && word.charAt(word.length() - 1) == 'y') {
                for (int j = 0; j < word.length() - 1; j++) {
                    System.out.print(word.charAt(j));
                }
                System.out.println("ies");
            } else if (!match && (word.charAt(word.length() - 1) == 'o' || word.charAt(word.length() - 1) == 's' || word.charAt(word.length() - 1) == 'x' || word.charAt(word.length() - 1) == 'h' && word.charAt(word.length() - 2) == 'c' || word.charAt(word.length() - 2) == 's')) {
                System.out.println(word + "es");
            } else if (!match) {
                System.out.println(word + "s");
            }
        }
    }

}
