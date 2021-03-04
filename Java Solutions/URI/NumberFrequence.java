import java.io.*;
import java.util.Collections;
import java.util.Vector;

public class NumberFrequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> vec = new Vector<Integer>();
        int n = Integer.parseInt(br.readLine()), x;
        while (n > 0) {
            x = Integer.parseInt(br.readLine());
            vec.add(x);
            n--;
        }
        Collections.sort(vec);
        int t = vec.lastElement(), arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < vec.size(); i++) {
            arr[vec.get(i) - 1]++;
        }
        for (int i = 0; i < t; i++) {
            if (arr[i] != 0) {
                System.out.println((i + 1) + " aparece " + arr[i] + " vez(es)");
            }
        }
    }

}
