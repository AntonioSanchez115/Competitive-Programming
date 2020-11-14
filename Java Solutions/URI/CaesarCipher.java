import java.io.*;

public class CaesarCipher {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String sent = br.readLine(), newSent = "";
            int d = Integer.parseInt(br.readLine());
            for (int i = 0; i < sent.length(); i++) {
                int curIndex = (int) sent.charAt(i);
                if (curIndex - d < 65) {
                    curIndex = 91 - (d - (curIndex - 65));
                } else {
                    curIndex = curIndex - d;
                }
                newSent += Character.toString((char) curIndex);
            }
            System.out.println(newSent);
            t--;
        }
    }

}
