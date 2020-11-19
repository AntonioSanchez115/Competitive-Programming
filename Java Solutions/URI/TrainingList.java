import java.io.*;

public class TrainingList {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, c = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < c; i++) {
            int x = Integer.parseInt(s[i]);
            if (x == 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
