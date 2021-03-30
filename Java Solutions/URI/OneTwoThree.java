import java.io.*;

public class OneTwoThree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, one = "one", two = "two";
        int t = Integer.parseInt(br.readLine()), n1, n2;
        while (t > 0) {
            str = br.readLine();
            if (str.length() == 3) {
                n1 = 0;
                n2 = 0;
                for (int i = 0; i < 3; i++) {
                    if (str.charAt(i) == one.charAt(i)) {
                        n1++;
                    }
                    if (str.charAt(i) == two.charAt(i)) {
                        n2++;
                    }
                }
                System.out.println(((n1 > n2) ? "1" : "2"));
            } else {
                System.out.println("3");
            }
            t--;
        }
    }

}
