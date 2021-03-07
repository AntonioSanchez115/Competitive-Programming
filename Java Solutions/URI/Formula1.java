import java.io.*;
import java.util.PriorityQueue;

public class Formula1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g, p, s, k;
        while (true) {
            String str[] = br.readLine().split(" ");
            g = Integer.parseInt(str[0]);
            p = Integer.parseInt(str[1]);
            if (g + p == 0) {
                break;
            }
            int m[][] = new int[g][p];
            for (int i = 0; i < g; i++) {
                str = br.readLine().split(" ");
                for (int j = 0; j < p; j++) {
                    m[i][j] = Integer.parseInt(str[j]);
                }
            }
            s = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> winner = new PriorityQueue<Integer>();
            for (int i = 0; i < s; i++) {
                str = br.readLine().split(" ");
                k = Integer.parseInt(str[0]);
                int points[] = new int[k], scores[] = new int[p];
                for (int j = 0; j < p; j++) {
                    scores[j] = 0;
                }
                for (int j = 0; j < k; j++) {
                    points[j] = Integer.parseInt(str[j + 1]);
                }
                for (int a = 0; a < g; a++) {
                    for (int b = 0; b < k; b++) {
                        int point = points[b];
                        for (int c = 0; c < p; c++) {
                            if (m[a][c] == b + 1) {
                                scores[c] += point;
                            }
                        }

                    }
                }
                int higher = 0;
                for (int j = 0; j < p; j++) {
                    if (scores[j] > higher) {
                        higher = scores[j];
                    }
                }
                for (int j = 0; j < p; j++) {
                    if (scores[j] == higher) {
                        winner.add(j + 1);
                    }
                }
                System.out.print(winner.poll());
                while (!winner.isEmpty()) {
                    System.out.print(" " + winner.poll());
                }
                System.out.println("");
            }
        }
    }

}
