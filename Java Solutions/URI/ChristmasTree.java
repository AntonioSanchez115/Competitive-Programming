import java.io.*;
import java.util.Arrays;

public class ChristmasTree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            for (int i = n / 2, j = 1; i >= 0; i--, j += 2) {
                char[] white = new char[i];
                Arrays.fill(white, ' ');
                char[] aster = new char[j];
                Arrays.fill(aster, '*');
                System.out.print(white);
                System.out.println(aster);
            }
            for (int i = n / 2, x = 0, j = 1; x < 2; i--, j += 2, x++) {
                char[] white = new char[i];
                Arrays.fill(white, ' ');
                char[] aster = new char[j];
                Arrays.fill(aster, '*');
                System.out.print(white);
                System.out.println(aster);
            }
            System.out.println("");
        }
    }

}
