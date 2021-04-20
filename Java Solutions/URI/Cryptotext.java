import java.io.*;

public class Cryptotext {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str;
        while ((t--) > 0) {
            str = br.readLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println("");
        }
    }

}
