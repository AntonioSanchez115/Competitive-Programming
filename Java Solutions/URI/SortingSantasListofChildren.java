import java.io.*;
import static java.util.Collections.sort;
import java.util.Vector;

public class SortingSantasListofChildren {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int gb = 0, bb = 0;
        Vector names = new Vector();
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            if (s[0].charAt(0) == '+') {
                gb++;
            } else {
                bb++;
            }
            names.add(s[1]);
        }
        sort(names);
        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Se comportaram: " + gb + " | Nao se comportaram: " + bb);
    }

}
