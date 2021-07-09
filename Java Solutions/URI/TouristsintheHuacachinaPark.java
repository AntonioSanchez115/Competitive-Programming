import java.io.*;

public class TouristsintheHuacachinaPark {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[], str;
        int t, tourists = 0, cars = 0;
        while (true) {
            s = br.readLine().split(" ");
            str = s[0];
            if (str.equals("ABEND")) {
                break;
            }
            t = Integer.parseInt(s[1]);
            if (str.equals("SALIDA")) {
                cars++;
                tourists += t;
            } else {
                cars--;
                tourists -= t;
            }
        }
        System.out.println(tourists + "\n" + cars);
    }

}
