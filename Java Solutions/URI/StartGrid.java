import java.io.*;

public class StartGrid {

    static int start[] = new int[25], fin[] = new int[25];

    static int lookPos(int n, int x) {
        for (int i = 0; i < n; i++) {
            if (start[i] == fin[x]) {
                return i;
            }
        }
        return -1;
    }

    static void swap(final int[] arr, final int pos1, final int pos2) {
        final int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, tmp, swaps;
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            String s[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                start[i] = Integer.parseInt(s[i]);
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                fin[i] = Integer.parseInt(s[i]);
            }
            swaps = 0;
            for (int i = 0; i < n; i++) {
                while (start[i] != fin[i]) {
                    tmp = lookPos(n, i);
                    swap(start, (tmp - 1), (tmp));
                    swaps++;
                }
            }
            System.out.println(swaps);
        }
    }

}
