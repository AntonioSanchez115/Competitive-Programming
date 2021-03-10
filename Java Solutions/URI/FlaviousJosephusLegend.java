import java.io.*;
import java.util.Vector;

public class FlaviousJosephusLegend {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nc, n, k, it;
        Vector< Integer> vec = new Vector< Integer>();
        nc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= nc; t++) {
            String s[] = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            k = Integer.parseInt(s[1]);
            for (int i = 0; i < n; i++) {
                vec.add(i);
            }
            it = 0;
            while (vec.size() > 1) {
                for (int i = 1; i < k; i++) {
                    if (it == vec.size()) {
                        it = 0;
                    }
                    it++;
                }
                if (it == vec.size()) {
                    it = 0;
                }
                vec.remove(it);
            }
            System.out.println("Case " + t + ": " + (vec.get(0) + 1));
            vec.clear();
        }
    }

}
