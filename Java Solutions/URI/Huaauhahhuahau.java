import java.io.*;

public class Huaauhahhuahau {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str0;
        Boolean palind = true;
        str0 = br.readLine();
        for (int i = 0; i < str0.length(); i++) {
            if (str0.charAt(i) == 'a' || str0.charAt(i) == 'e' || str0.charAt(i) == 'i' || str0.charAt(i) == 'o' || str0.charAt(i) == 'u') {
                str += str0.charAt(i);
            }
        }
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                palind = false;
            }
        }
        System.out.println(((palind) ? "S" : "N"));
    }

}
