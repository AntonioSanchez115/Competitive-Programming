import java.io.*;

public class InputandOutput6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, s1 = "", s2 = "";
        str = br.readLine();
        for (int i = str.indexOf('.') + 1; i < str.length(); i++) {
            s1 += str.charAt(i);
        }
        for (int i = 0; i < str.indexOf('.'); i++) {
            s2 += str.charAt(i);
        }
        System.out.println(Integer.parseInt(s1) + "." + Integer.parseInt(s2));
    }

}
