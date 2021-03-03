
import java.io.*;
import java.util.*;
import static java.util.Collections.sort;

class Nation {

    String name;
    int g;
    int s;
    int b;

    Nation(String name, int g, int s, int b) {
        this.name = name;
        this.g = g;
        this.s = s;
        this.b = b;
    }

    public static class Comparators {

        public static Comparator<Nation> cmp = new Comparator<Nation>() {
            @Override
            public int compare(Nation a, Nation b) {
                if (a.g != b.g) {
                    if (a.g > b.g) {
                        return -1;
                    }
                    return 1;
                }
                if (a.s != b.s) {
                    if (a.s > b.s) {
                        return -1;
                    }
                    return 1;
                }
                if (a.b != b.b) {
                    if (a.b > b.b) {
                        return -1;
                    }
                    return 1;
                }
                return a.name.compareTo(b.name);

            }
        };
    }

}

public class MedalTable {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Nation> arr = new LinkedList<Nation>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            int c = Integer.parseInt(s[3]);
            arr.add(new Nation(s[0], a, b, c));
        }

        Collections.sort(arr, Nation.Comparators.cmp);
        for (int it = 0; it < arr.size(); it++) {
            Nation i = arr.get(it);
            System.out.println(i.name + " " + i.g + " " + i.s + " " + i.b);
        }
    }

}
