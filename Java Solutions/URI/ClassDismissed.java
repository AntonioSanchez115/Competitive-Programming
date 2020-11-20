import java.io.*;

public class ClassDismissed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), inClass = 0;
        int k = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s[i]);
            if (x <= 0) {
                inClass++;
            }
        }
        System.out.println(((k <= inClass) ? "YES" : "NO"));
    }

}
