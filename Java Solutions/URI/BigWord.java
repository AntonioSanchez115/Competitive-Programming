import java.io.*;

public class BigWord {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(((str.length() >= 9) ? "palavrao" : "palavrinha"));
        }
    }

}
