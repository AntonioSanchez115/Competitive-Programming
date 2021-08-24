import java.io.*;

public class HardChoice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c, b, p, p1, p2, p3, sum = 0;
        String s[] = br.readLine().split(" ");
        c = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        p = Integer.parseInt(s[2]);
        s = br.readLine().split(" ");
        p1 = Integer.parseInt(s[0]);
        p2 = Integer.parseInt(s[1]);
        p3 = Integer.parseInt(s[2]);
        sum += (p1 > c) ? (p1 - c) : 0;
        sum += (p2 > b) ? (p2 - b) : 0;
        sum += (p3 > p) ? (p3 - p) : 0;
        System.out.println(sum);
    }

}
