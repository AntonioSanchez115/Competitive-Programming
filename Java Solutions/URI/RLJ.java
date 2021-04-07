import java.io.*;

public class RLJ {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        String exp, sa, sb, sc;
        while ((exp = br.readLine()) != null) {
            sa = exp.substring(0, exp.indexOf('+'));
            sb = exp.substring(exp.indexOf('+') + 1, exp.indexOf('='));
            sc = exp.substring(exp.indexOf('=') + 1);
            if (sa.charAt(0) >= 'A' && sa.charAt(0) <= 'Z') {
                System.out.println(Integer.parseInt(sc) - Integer.parseInt(sb));
            } else if (sb.charAt(0) >= 'A' && sb.charAt(0) <= 'Z') {
                System.out.println(Integer.parseInt(sc) - Integer.parseInt(sa));
            } else {
                System.out.println(Integer.parseInt(sa) + Integer.parseInt(sb));
            }
        }
    }

}
