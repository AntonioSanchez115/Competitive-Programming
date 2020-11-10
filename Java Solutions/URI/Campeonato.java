
import java.io.*;

public class Campeonato {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int cv = Integer.parseInt(s[0]);
        int ce = Integer.parseInt(s[1]);
        int cs = Integer.parseInt(s[2]);
        int fv = Integer.parseInt(s[3]);
        int fe = Integer.parseInt(s[4]);
        int fs = Integer.parseInt(s[5]);
        cv = cv * 3 + ce;
        fv = fv * 3 + fe;
        if (cv == fv) {
            if (cs == fs) {
                System.out.println("=");
            } else {
                System.out.println(((cs > fs) ? "C" : "F"));
            }
        } else {
            System.out.println(((cv > fv) ? "C" : "F"));
        }
    }

}
