
import java.io.*;

public class AutomatedCheckingMachine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int vec1[] = new int[5];
        int vec2[] = new int[5];
        Boolean c = true;
        for (int i = 0; i < 5; i++) {
            vec1[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            vec2[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (vec1[i] == vec2[i]) {
                c = false;
            }
        }
        System.out.println((c) ? "Y" : "N");
    }

}
