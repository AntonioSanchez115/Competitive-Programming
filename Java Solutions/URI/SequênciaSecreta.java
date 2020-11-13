import java.io.*;

public class SequênciaSecreta {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean one = true, two = false;
        int n, x, m = 1;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());
            if (one) {
                if (x == 2) {
                    m++;
                    one = false;
                    two = true;
                }
            } else {
                if (x == 1) {
                    m++;
                    one = true;
                    two = false;
                }
            }
        }
        System.out.println(m);
    }

}
