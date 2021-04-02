import java.io.*;

public class Letras {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c, x;
        String txt, word;
        double sum = 0;
        c = br.readLine().charAt(0);
        txt = br.readLine();
        String vec[] = txt.split(" ");
        for (int i = 0; i < vec.length; i++) {
            word = vec[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    sum++;
                    break;
                }
            }
        }
        System.out.printf("%.1f\n", (double) (sum / (double) vec.length * 100.0));
    }

}
