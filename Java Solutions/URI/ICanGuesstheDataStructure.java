import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ICanGuesstheDataStructure {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, t, x;
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> s = new Stack<Integer>();
            Boolean isPrior = true, isQueue = true, isStack = true;
            while ((n--) > 0) {
                String S[] = br.readLine().split(" ");
                t = Integer.parseInt(S[0]);
                x = Integer.parseInt(S[1]);
                if (t == 1) {
                    pq.add(x);
                    q.add(x);
                    s.add(x);
                } else {
                    if (pq.poll() != x) {
                        isPrior = false;
                    }
                    if (q.poll() != x) {
                        isQueue = false;
                    }
                    if (s.peek() != x) {
                        isStack = false;
                    }
                    s.pop();
                }
            }
            if ((isPrior && isQueue) || (isPrior && isStack) || (isQueue && isStack)) {
                System.out.println("not sure");
            } else if (isPrior) {
                System.out.println("priority queue");
            } else if (isQueue) {
                System.out.println("queue");
            } else if (isStack) {
                System.out.println("stack");
            } else {
                System.out.println("impossible");
            }
        }
    }

}
