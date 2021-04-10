import java.io.*;

public class Decifra {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seq, str, abc = "abcdefghijklmnopqrstuvwxyz";
        int pos = 0;
        seq = br.readLine();
        str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < abc.length(); j++) {
                if (abc.charAt(j) == c) {
                    pos = j;
                    break;
                }
            }
            System.out.print(seq.charAt(pos));
        }
        System.out.println("");
    }

}
