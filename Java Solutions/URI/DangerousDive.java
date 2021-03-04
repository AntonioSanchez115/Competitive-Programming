import java.io.*;
import java.util.PriorityQueue;

public class DangerousDive {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, r, x;
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            n = Integer.parseInt(s[0]);
            r = Integer.parseInt(s[1]);
            Boolean div[] = new Boolean[n], flag = true;
            for (int i = 0; i < n; i++) {
                div[i] = false;
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < r; i++) {
                x = Integer.parseInt(s[i]);
                div[x - 1] = true;
            }
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for (int i = 0; i < n; i++) {
                if (!div[i]) {
                    pq.add(i + 1);
                }
            }
            if (pq.isEmpty()) {
                System.out.println("*");
            } else {
                while (!pq.isEmpty()) {
                    System.out.print(pq.peek() + " ");
                    pq.remove();
                }
                System.out.println("");
            }
        }
    }

}
