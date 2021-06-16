import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class TheBadVibesWalk {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        String cell;
        PriorityQueue<Integer> v = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> d = new PriorityQueue<Integer>(Collections.reverseOrder());
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                cell = s[j];
                c = cell.charAt(1);
                if (c == 'V') {
                    v.add(cell.charAt(0) - '0');
                } else {
                    d.add(cell.charAt(0) - '0');
                }
            }
        }
        while (!v.isEmpty()) {
            System.out.println(v.poll() + "V");
        }
        while (!d.isEmpty()) {
            System.out.println(d.poll() + "D");
        }
    }

}
