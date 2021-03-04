import java.io.*;

public class AlarmClock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ( true ) {
            String s[] = br.readLine().split(" ");
            int h1 = Integer.parseInt(s[0]), minute = 0;
            int m1 = Integer.parseInt(s[1]), currentMinute;
            int h2 = Integer.parseInt(s[2]), finalMinute;
            int m2 = Integer.parseInt(s[3]);
            if ((h1 + h2 + m1 + m2) == 0) {
                break;
            }
            currentMinute = (h1 * 60) + m1;
            finalMinute = (h2 * 60) + m2;
            while (true) {
                if (currentMinute == finalMinute) {
                    break;
                }
                if (currentMinute == 1440) {
                    currentMinute = 0;
                }
                currentMinute++;
                minute++;
            }
            System.out.println(minute);
        }
    }

}
