import java.io.*;

public class InternationalChat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, k;
        Boolean same;
        String group[] = new String[101];
        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            same = true;
            k = Integer.parseInt(br.readLine());
            for (int i = 0; i < k; i++) {
                group[i] = br.readLine();
            }
            for (int i = 0; i < k - 1; i++) {
                if (!group[i].equals(group[i + 1])) {
                    same = false;
                }
            }
            System.out.println(((same) ? group[0] : "ingles"));
            t--;
        }
    }

}
