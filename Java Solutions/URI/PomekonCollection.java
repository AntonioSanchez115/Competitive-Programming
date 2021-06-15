import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class PomekonCollection {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str;
        Set<String> dek = new HashSet<String>();
        while ((n--) > 0) {
            str = br.readLine();
            dek.add(str);
        }
        System.out.println("Falta(m) " + (151 - dek.size()) + " pomekon(s).");
    }

}
