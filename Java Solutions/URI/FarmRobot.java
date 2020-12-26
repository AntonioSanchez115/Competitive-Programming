import java.io.*;

public class FarmRobot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int robot = 1, times = 0;
        int n = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);
        int s = Integer.parseInt(str[2]);
        str = br.readLine().split(" ");
        for (int i = 0; i < c; i++) {
            int x = Integer.parseInt(str[i]);
            if (robot == s) {
                times++;
            }
            if (x == 1) {
                robot++;
            } else {
                robot--;
            }
            if (robot == n + 1) {
                robot = 1;
            }
            if (robot == 0) {
                robot = n;
            }
        }
        if (robot == s) {
            times++;
        }
        System.out.println(times);
    }

}
