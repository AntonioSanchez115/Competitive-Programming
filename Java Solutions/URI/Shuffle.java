import java.io.*;

public class Shuffle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(" ");
            int m = Integer.parseInt(s[0]), x, c;
            int k = Integer.parseInt(s[1]);
            int song[] = new int[m], appear[] = new int[m], time = 0;
            Boolean flag = true;
            s = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                song[i] = Integer.parseInt(s[i]);
                appear[i] = 0;
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < k; i++) {
                x = Integer.parseInt(s[i]);
                if (flag) {
                    time += song[x - 1];
                }
                appear[x - 1] = 1;
                c = 0;
                for (int j = 0; j < m; j++) {
                    if (appear[j] == 1) {
                        c++;
                    }
                }
                if (c == m) {
                    flag = false;
                }
            }
            flag = true;
            for (int i = 0; i < m && flag; i++) {
                if (appear[i] == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(time);
            } else {
                System.out.println("-1");
            }
        }
    }

}
