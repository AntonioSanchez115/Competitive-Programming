import java.io.*;

public class MyTemporaryPassword {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, pass;
        int t = Integer.parseInt(br.readLine()), it;
        while (t > 0) {
            str = br.readLine();
            if (str.length() == 20 && !str.endsWith("RA000000000000000000") && str.charAt(0) == 'R' && str.charAt(1) == 'A') {
                pass = "";
                it = 2;
                while (str.charAt(it) == '0') {
                    it++;
                }
                pass = str.substring(it);
                System.out.println(pass);
            } else {
                System.out.println("INVALID DATA");
            }
            t--;
        }
    }

}
