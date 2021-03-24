import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class GenerateRandomNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, t;
        Set<Integer> randomNumbers = new HashSet<Integer>();
        while (true) {
            a = Integer.parseInt(br.readLine());
            if (a == 0) {
                break;
            }
            t = 112;
            while (t > 0) {
                randomNumbers.add(a);
                a *= a;
                String num = Integer.toString(a);
                for (int i = num.length(); i < 8; i++) {
                    num = "0" + num;
                }
                String subs = num.substring(2, 6);
                a = Integer.parseInt(subs);
                t--;
            }
            System.out.println(randomNumbers.size());
            randomNumbers.clear();
        }
    }

}
