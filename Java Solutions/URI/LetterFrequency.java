import java.io.*;
import static java.util.Collections.sort;
import java.util.Vector;

public class LetterFrequency {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, mf;
        String str;
        Vector<Character> letters = new Vector<Character>();
        t = Integer.parseInt(br.readLine());
        while ((t--) > 0) {
            str = br.readLine();
            int vec[] = new int[91];
            mf = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.toUpperCase(str.charAt(i)) >= 'A' && Character.toUpperCase(str.charAt(i)) <= 'Z') {
                    vec[Character.toUpperCase(str.charAt(i))]++;
                }
            }
            for (int i = 65; i < 91; i++) {
                mf = Math.max(mf, vec[i]);
            }
            for (int i = 65; i < 91; i++) {
                if (vec[i] == mf) {
                    letters.add((char) Character.toLowerCase(i));
                }
            }
            sort(letters);
            for (int i = 0; i < letters.size(); i++) {
                System.out.print(letters.elementAt(i));
            }
            System.out.println("");
            letters.clear();
        }
    }

}
