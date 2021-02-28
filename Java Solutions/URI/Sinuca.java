import java.io.*;

public class Sinuca {

    static String sinuca(int vec[], int s) {
        if (s == 1) {
            if (vec[0] == 1) {
                return "preta";
            }
            return "branca";
        }
        int vec1[] = new int[s - 1];
        for (int i = 0; i < s - 1; i++) {
            if (vec[i] == vec[i + 1]) {
                vec1[i] = 1;
            } else {
                vec1[i] = -1;
            }
        }
        return sinuca(vec1, s - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int vec[] = new int[n];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            vec[i] = Integer.parseInt(s[i]);
        }
        System.out.println(sinuca(vec, n));
    }

}
