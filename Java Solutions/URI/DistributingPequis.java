import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class DistributingPequis {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), x, y;
        int k = Integer.parseInt(s[1]);
        int aux[] = new int[n], m[][] = new int[n][n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            aux[i] = Integer.parseInt(s[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            q.add(aux[i]);
        }
        for (int i = 0; i < n; i++) {
            aux[i] = 0;
            for (int j = 0; j < n; j++) {
                m[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                m[i][j] = q.peek();
                q.add(q.peek());
                q.remove();
            }
            q.add(q.peek());
            q.remove();
        }
        for (int i = 0; k > 0; i++) {
            if (i == n) {
                i = 0;
            }
            for (int j = 0; j < n; j++) {
                aux[j] += m[i][j];
            }
            k--;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(aux[i]);
            } else {
                System.out.print(" " + aux[i]);
            }
        }
        System.out.println("");
    }

}
