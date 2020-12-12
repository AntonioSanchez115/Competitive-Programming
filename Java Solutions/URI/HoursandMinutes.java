import java.io.*;

public class HoursandMinutes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            System.out.println((n % 6 == 0) ? "Y" : "N");
        }
    }

}
