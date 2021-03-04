import java.io.*;

public class Libertadores {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int m1, m2, v1, v2, w1, w2;
        while (t > 0) {
            char x;
            String s[] = br.readLine().split(" ");
            m1 = Integer.parseInt(s[0]);
            v1 = Integer.parseInt(s[2]);
            s = br.readLine().split(" ");
            m2 = Integer.parseInt(s[0]);
            v2 = Integer.parseInt(s[2]);
            if (m1 == v1) {
                w1 = 0;
            } else {
                w1 = (m1 > v1) ? 1 : 2;
            }
            if (m2 == v2) {
                w2 = 0;
            } else {
                w2 = (m2 > v2) ? 2 : 1;
            }
            if ((w1 == 0 && w2 == 1) || ((w1 == 1) && (w2 == 0 || w2 == 1))) {
                System.out.println("Time 1");
            } else if ((w1 == 0 && w2 == 2) || ((w1 == 2) && (w2 == 0 || w2 == 2))) {
                System.out.println("Time 2");
            } else {
                if ((m1 + v2) == (v1 + m2)) {
                    if (v2 == v1) {
                        System.out.println("Penaltis");
                    } else {
                        System.out.println((v2 > v1) ? "Time 1" : "Time 2");
                    }
                } else {
                    System.out.println(((m1 + v2) > (v1 + m2)) ? "Time 1" : "Time 2");
                }
            }
            t--;
        }
    }

}
