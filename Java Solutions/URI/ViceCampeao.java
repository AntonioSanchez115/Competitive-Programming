import java.io.*;
import static java.util.Arrays.sort;

public class ViceCampeao {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vec[] = new int[3];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        sort(vec);
        System.out.println(vec[1]);
    }

}
