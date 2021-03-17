import java.io.*;

public class AdvancingLetters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), sum;
        String a, b, s[];
        while (t > 0) {
            sum = 0;
            s = br.readLine().split(" ");
            a = s[0];
            b = s[1];
            if (!a.equals(b)) {
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) <= b.charAt(i)) {
                        sum += (int) b.charAt(i) - (int) a.charAt(i);
                    } else {
                        sum += ((int) 'z' - (int) a.charAt(i)) + ((int) b.charAt(i) - (int) 'a' + 1);
                    }
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
