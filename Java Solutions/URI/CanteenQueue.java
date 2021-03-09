import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class CanteenQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int m = Integer.parseInt(br.readLine()), d = 0;
            int vec[] = new int[m];
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                vec[i] = Integer.parseInt(s[i]);
                pq.add(vec[i]);
            }
            for (int i = 0; i < m; i++) {
                if (vec[i] == pq.poll()) {
                    d++;
                }
            }
            System.out.println(d);
            t--;
        }
    }

}
