import java.io.*;

public class MultipleReading {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, str1;
        int p, i, c;
        while ((str = br.readLine()) != null && (str1 = br.readLine()) != null) {
            p = Integer.parseInt(str1);
            i = 0;
            c = 0;
            while (i < str.length()) {
                if (str.charAt(i) == 'R') {
                    int j = i;
                    while (j < str.length() && j < i + p) {
                        if (str.charAt(j) == 'W') {
                            break;
                        }
                        j++;
                    }
                    c++;
                    i = j;
                } else {
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }

}
