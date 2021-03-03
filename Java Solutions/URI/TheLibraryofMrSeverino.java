import java.io.*;
import static java.util.Collections.sort;
import java.util.Vector;

public class TheLibraryofMrSeverino {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s, str;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            Vector<String> reg = new Vector<String>();
            for (int i = 0; i < n; i++) {
                str = br.readLine();
                reg.add(str);
            }
            sort(reg);
            for (String i : reg) {
                System.out.println(i);
            }
        }
    }

}
