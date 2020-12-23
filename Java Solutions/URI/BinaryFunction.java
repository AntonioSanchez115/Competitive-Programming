import java.io.*;

public class BinaryFunction {

    public static String longDivision(String number, int divisor) {
        StringBuilder result = new StringBuilder();
        char[] dividend = number.toCharArray();
        int carry = 0;
        for (int i = 0; i < dividend.length; i++) {
            int x = carry * 10 + Character.getNumericValue(dividend[i]);
            result.append(x / divisor);
            carry = x % divisor;
        }
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '0') {
                return result.substring(i);
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int num = 0;
            String n;
            n = br.readLine();
            while (n.length() > 0) {
                int lastNum = Character.getNumericValue(n.charAt(n.length() - 1));
                if (lastNum % 2 == 1) {
                    num++;
                }
                n = longDivision(n, 2);
            }
            System.out.println(num);
            t--;
        }
    }

}
