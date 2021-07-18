import java.io.*;

public class Bean {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vec[] = new int[4];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < 4; i++) {
            if (vec[i] == 1) {
                System.out.println(i + 1);
            }
        }
    }

}
