
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.awt.Point;
import java.util.ArrayList;

class PointCompare implements Comparator<Point> {

    public int compare(final Point a, final Point b) {
        if (a.x < b.x) {
            return -1;
        } else if (a.x > b.x) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class AmbiguousPermutations {

    static Boolean compareVec(int vec1[], int vec2[], int n) {
        for (int i = 0; i < n; i++) {
            if (vec1[i] != vec2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Point> vec = new ArrayList<Point>();
        String s[];
        while (true) {
            int n = Integer.parseInt(br.readLine()), x;
            if (n == 0) {
                break;
            }
            int vec1[] = new int[n], vec2[] = new int[n];
            s = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                x = Integer.parseInt(s[i]);
                vec1[i] = x;
                vec.add(new Point(x, i + 1));
            }
            Collections.sort(vec, new PointCompare());
            for (int i = 0; i < n; i++) {
                vec2[i] = vec.get(i).y;
            }
            System.out.println((compareVec(vec1, vec2, n) ? "ambiguous" : "not ambiguous"));
            vec.clear();
        }
    }

}
